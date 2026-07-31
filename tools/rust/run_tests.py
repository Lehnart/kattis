import pathlib
import subprocess
import sys


ROOT = pathlib.Path(__file__).resolve().parents[2]
requested_problem = sys.argv[1] if len(sys.argv) > 1 else None
manifest = ROOT / "rust" / "Cargo.toml"

for source in sorted((ROOT / "rust").glob("*/src/bin/*.rs")):
    letter = source.parents[2].name
    problem = source.stem
    if requested_problem and problem != requested_problem:
        continue
    problem_dir = ROOT / "problems" / letter / problem
    if not problem_dir.is_dir():
        raise RuntimeError(f"Problem directory not found for {letter}/{problem}")

    tests = problem_dir / "tests"
    if not tests.is_dir():
        print(f"Skipping {problem}: no tests directory at {tests}")
        continue

    print(f"\n=== {problem} ({source.relative_to(ROOT)}) ===", flush=True)
    inputs = sorted(tests.glob("input*"))
    outputs = sorted(tests.glob("output*"))
    if len(inputs) != len(outputs):
        raise RuntimeError(
            f"Unmatched tests for {problem}: "
            f"{len(inputs)} input file(s), {len(outputs)} output file(s)"
        )

    for index, (input_file, output_file) in enumerate(zip(inputs, outputs), start=1):
        command = [
            "cargo",
            "run",
            "--manifest-path",
            str(manifest),
            "-p",
            f"kattis-{letter}",
            "--bin",
            problem,
        ]
        print(
            f"Test {index}/{len(inputs)}: "
            f"{input_file.name} -> {output_file.name}",
            flush=True,
        )
        print(f"Command: {subprocess.list2cmdline(command)}", flush=True)
        test_input = input_file.read_text()
        result = subprocess.run(
            command,
            input=test_input,
            capture_output=True,
            text=True,
            check=False,
        )
        if result.returncode != 0:
            print(f"FAILED with exit code {result.returncode}", file=sys.stderr)
            print("--- stdin ---", file=sys.stderr)
            print(test_input, file=sys.stderr, end="")
            print("\n--- stdout ---", file=sys.stderr)
            print(result.stdout or "<empty>", file=sys.stderr, end="")
            print("\n--- stderr ---", file=sys.stderr)
            print(result.stderr or "<empty>", file=sys.stderr, end="")
            raise SystemExit(result.returncode)

        expected = output_file.read_text()
        if result.stdout != expected:
            print("FAILED: output mismatch", file=sys.stderr)
            print(f"Input file: {input_file}", file=sys.stderr)
            print(f"Expected ({output_file}): {expected!r}", file=sys.stderr)
            print(f"Actual: {result.stdout!r}", file=sys.stderr)
            if result.stderr:
                print(f"Stderr: {result.stderr}", file=sys.stderr)
            raise SystemExit(1)

        print("PASS")
