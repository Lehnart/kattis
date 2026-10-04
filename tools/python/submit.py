"""Submit the python solution for a Kattis problem."""

import pathlib
import sys

sys.path.insert(0, str(pathlib.Path(__file__).resolve().parents[1]))
from submit_solution import main

if __name__ == "__main__":
    raise SystemExit(main("python"))
