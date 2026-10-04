"""Locate a language-specific solution and invoke the Kattis submission client."""

import argparse
import pathlib
import re
import subprocess
import sys

ROOT = pathlib.Path(__file__).resolve().parents[1]
PATTERNS = {
    "python": "*/{problem}.py",
    "java": "*/{problem}/Main.java",
    "rust": "*/src/bin/{problem}.rs",
}


def main(language):
    parser = argparse.ArgumentParser(description=f"Submit a {language} solution by problem ID.")
    parser.add_argument("problem")
    parser.add_argument("--dry-run", action="store_true", help="Print command without submitting")
    args = parser.parse_args()
    problem = args.problem.strip().lower()
    if not re.fullmatch(r"[a-z0-9]+", problem):
        parser.error("Problem ID must contain only letters and digits")
    sources = sorted((ROOT / language).glob(PATTERNS[language].format(problem=problem)))
    if len(sources) != 1:
        print(f"Expected one {language} solution for {problem}, found {len(sources)}.", file=sys.stderr)
        return 1
    command = [sys.executable, str(ROOT / "submit.py"), "--force", "-p", problem, str(sources[0].relative_to(ROOT))]
    print(subprocess.list2cmdline(command), flush=True)
    if args.dry_run:
        return 0
    return subprocess.run(command, cwd=ROOT, check=False).returncode
