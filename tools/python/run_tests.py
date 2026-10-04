"""Run Python solutions against the shared sample tests."""

import argparse
import pathlib
import subprocess
import sys

ROOT = pathlib.Path(__file__).resolve().parents[2]


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("problem", nargs="?", help="Kattis problem ID (default: all)")
    args = parser.parse_args()
    sources = sorted((ROOT / "python").glob("*/*.py"))
    if args.problem:
        sources = [source for source in sources if source.stem == args.problem]
    if not sources:
        print("No matching Python solutions found.", file=sys.stderr)
        return 1

    for source in sources:
        tests = ROOT / "problems" / source.parent.name / source.stem / "tests"
        inputs = sorted(tests.glob("input*.txt"))
        if not inputs:
            print(f"No sample inputs found: {tests}", file=sys.stderr)
            return 1
        outputs = {"output" + path.name[len("input"):] for path in inputs}
        if outputs != {path.name for path in tests.glob("output*.txt")}:
            print(f"Unmatched sample files: {tests}", file=sys.stderr)
            return 1
        print(f"Running Python tests for {source.stem}", flush=True)
        for input_file in inputs:
            output_file = tests / ("output" + input_file.name[len("input"):])
            with input_file.open(encoding="utf-8") as stream:
                result = subprocess.run(
                    [sys.executable, str(source)], stdin=stream,
                    capture_output=True, text=True, encoding="utf-8", check=False,
                )
            if result.returncode:
                print(f"FAILED {input_file.name}: exit code {result.returncode}", file=sys.stderr)
                print(result.stderr, file=sys.stderr)
                return 1
            expected = output_file.read_text(encoding="utf-8")
            if result.stdout != expected:
                print(f"FAILED {input_file}\nexpected: {expected!r}\nactual: {result.stdout!r}", file=sys.stderr)
                return 1
            print(f"PASS {input_file.name}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
