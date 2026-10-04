"""Download Kattis samples and create a java template."""

import pathlib
import sys

sys.path.insert(0, str(pathlib.Path(__file__).resolve().parents[2]))
from download_problem import main

if __name__ == "__main__":
    raise SystemExit(main("java"))
