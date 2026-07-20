#!/usr/bin/env python3
"""Submit a Rust solution by Kattis problem id."""

from __future__ import annotations

import argparse
import pathlib
import re
import subprocess
import sys


ROOT = pathlib.Path(__file__).resolve().parents[2]
PROBLEM_ID = re.compile(r"^[a-z0-9]+$")


def find_source(problem: str) -> pathlib.Path:
    matches = list((ROOT / "rust").glob(f"*/src/bin/{problem}.rs"))
    if not matches:
        raise RuntimeError(f"No Rust solution found for {problem}")
    if len(matches) > 1:
        locations = ", ".join(str(path.relative_to(ROOT)) for path in matches)
        raise RuntimeError(f"Multiple Rust solutions found for {problem}: {locations}")
    return matches[0]


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(
        description="Submit a Rust solution to Kattis from its problem id."
    )
    parser.add_argument("problem", help="Kattis problem id, for example: carrots")
    parser.add_argument(
        "--dry-run",
        action="store_true",
        help="print the submission command without executing it",
    )
    return parser.parse_args()


def main() -> int:
    args = parse_args()
    problem = args.problem.strip().lower()
    if not PROBLEM_ID.fullmatch(problem):
        print("Problem id must contain only lowercase letters and digits.", file=sys.stderr)
        return 2

    try:
        source = find_source(problem)
    except RuntimeError as error:
        print(f"error: {error}", file=sys.stderr)
        return 1

    relative_source = source.relative_to(ROOT)
    command = [
        sys.executable,
        str(ROOT / "submit.py"),
        "-p",
        problem,
        "-f",
        str(relative_source),
    ]
    display = f'python submit.py -p "{problem}" -f ".\\{str(relative_source).replace("/", "\\\\")}"'
    print(display)
    if args.dry_run:
        return 0

    return subprocess.run(command, cwd=ROOT, check=False).returncode


if __name__ == "__main__":
    raise SystemExit(main())
