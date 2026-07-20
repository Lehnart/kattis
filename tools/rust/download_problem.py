#!/usr/bin/env python3
"""Download a public Kattis problem's samples and prepare a Rust binary."""

from __future__ import annotations

import argparse
import io
import pathlib
import re
import sys
import urllib.error
import urllib.request
import zipfile


ROOT = pathlib.Path(__file__).resolve().parents[1]
KATTIS = "https://open.kattis.com/problems"
PROBLEM_ID = re.compile(r"^[a-z0-9]+$")

RUST_MANIFEST = """[package]
name = "kattis-{letter}"
version = "0.1.0"
edition = "2024"
publish = false
"""

RUST_MAIN = """use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    // TODO: solve the problem using `input`.
}
"""


def problem_group(problem: str) -> str:
    """Return the repository group for a Kattis problem id."""
    return problem[0] if problem[0].isalpha() else "0"


def fetch(url: str) -> bytes:
    request = urllib.request.Request(
        url,
        headers={"User-Agent": "kattis-solutions-downloader/1.0"},
    )
    with urllib.request.urlopen(request, timeout=30) as response:
        return response.read()


def validate_problem(problem: str) -> None:
    try:
        fetch(f"{KATTIS}/{problem}")
    except urllib.error.HTTPError as error:
        if error.code == 404:
            raise RuntimeError(f"Unknown Kattis problem: {problem}") from error
        raise RuntimeError(f"Kattis returned HTTP {error.code}") from error
    except urllib.error.URLError as error:
        raise RuntimeError(f"Could not contact Kattis: {error.reason}") from error


def sample_pairs(archive: bytes) -> list[tuple[str, bytes, bytes]]:
    with zipfile.ZipFile(io.BytesIO(archive)) as samples:
        files = {
            pathlib.PurePosixPath(name).name: samples.read(name)
            for name in samples.namelist()
            if not name.endswith("/")
        }

    inputs = {pathlib.Path(name).stem: data for name, data in files.items() if name.endswith(".in")}
    outputs = {
        pathlib.Path(name).stem: data
        for name, data in files.items()
        if name.endswith((".ans", ".out"))
    }
    missing = sorted(set(inputs) ^ set(outputs))
    if missing:
        raise RuntimeError(f"Unmatched sample files in archive: {', '.join(missing)}")
    return [(stem, inputs[stem], outputs[stem]) for stem in sorted(inputs)]


def write_new(path: pathlib.Path, content: str | bytes) -> bool:
    if path.exists():
        return False
    path.parent.mkdir(parents=True, exist_ok=True)
    if isinstance(content, bytes):
        path.write_bytes(content)
    else:
        path.write_text(content, encoding="utf-8")
    return True


def install_samples(problem: str, tests: pathlib.Path) -> int:
    try:
        archive = fetch(f"{KATTIS}/{problem}/file/statement/samples.zip")
    except urllib.error.HTTPError as error:
        if error.code == 404:
            print("No downloadable samples are available for this problem.")
            return 0
        raise RuntimeError(f"Kattis returned HTTP {error.code} for samples") from error
    except urllib.error.URLError as error:
        raise RuntimeError(f"Could not download samples: {error.reason}") from error

    pairs = sample_pairs(archive)
    tests.mkdir(parents=True, exist_ok=True)
    destinations = [
        path
        for index in range(1, len(pairs) + 1)
        for path in (tests / f"input{index}.txt", tests / f"output{index}.txt")
    ]
    existing = [path for path in destinations if path.exists()]
    if existing:
        raise RuntimeError(f"Refusing to overwrite existing sample: {existing[0]}")

    for index, (_, sample_input, sample_output) in enumerate(pairs, start=1):
        input_path = tests / f"input{index}.txt"
        output_path = tests / f"output{index}.txt"
        input_path.write_bytes(sample_input)
        output_path.write_bytes(sample_output)
    return len(pairs)


def prepare_rust(problem: str, group: str) -> pathlib.Path:
    crate = ROOT / "rust" / group
    write_new(crate / "Cargo.toml", RUST_MANIFEST.format(letter=group))

    source = crate / "src" / "bin" / f"{problem}.rs"
    created = write_new(source, RUST_MAIN)
    if not created:
        print(f"Keeping existing Rust source: {source.relative_to(ROOT)}")

    return source


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Download Kattis samples and create a Rust binary."
    )
    parser.add_argument("problem", help="Kattis problem id, for example: carrots")
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    problem = args.problem.strip().lower()
    if not PROBLEM_ID.fullmatch(problem):
        print("Problem id must contain only lowercase letters and digits.", file=sys.stderr)
        return 2

    try:
        validate_problem(problem)
        group = problem_group(problem)
        problem_dir = ROOT / "problems" / group / problem
        problem_dir.mkdir(parents=True, exist_ok=True)
        sample_count = install_samples(problem, problem_dir / "tests")
        source = prepare_rust(problem, group)
    except (RuntimeError, zipfile.BadZipFile) as error:
        print(f"error: {error}", file=sys.stderr)
        return 1

    print(f"Problem: {problem_dir.relative_to(ROOT)}")
    print(f"Samples installed: {sample_count}")
    print(f"Rust binary: {source.relative_to(ROOT)}")
    print(
        "Run: cargo run --manifest-path rust/Cargo.toml "
        f"-p kattis-{group} --bin {problem}"
    )
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
