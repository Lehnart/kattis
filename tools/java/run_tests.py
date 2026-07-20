import pathlib
import subprocess
import sys


ROOT = pathlib.Path(__file__).resolve().parents[2]
requested_letter = sys.argv[1] if len(sys.argv) > 1 else None
problems_root = ROOT / "problems"
letters = [requested_letter] if requested_letter else [p.name for p in problems_root.iterdir() if p.is_dir()]

for letter in sorted(letters):
    for problem_dir in sorted(p for p in (problems_root / letter).iterdir() if p.is_dir()):
        source = ROOT / "java" / letter / problem_dir.name / "Main.java"
        tests = problem_dir / "tests"
        if not source.exists() or not tests.is_dir():
            continue

        print(f"Running Java tests for {problem_dir.name}")
        inputs = sorted(tests.glob("input*"))
        outputs = sorted(tests.glob("output*"))
        if len(inputs) != len(outputs):
            raise RuntimeError(f"Unmatched tests for {problem_dir.name}")

        for input_file, output_file in zip(inputs, outputs):
            result = subprocess.run(
                ["java", str(source)],
                input=input_file.read_text(),
                capture_output=True,
                text=True,
                check=True,
            )
            expected = output_file.read_text()
            if result.stdout != expected:
                raise AssertionError(
                    f"{input_file}\nexpected: {expected!r}\nresult: {result.stdout!r}"
                )
