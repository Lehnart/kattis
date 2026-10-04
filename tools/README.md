# Language tools

From the repository root, replace `<language>` with `python`, `java`, or `rust`:

```sh
python tools/<language>/download_problem.py <problem>
python tools/<language>/submit.py <problem> --dry-run
python tools/<language>/submit.py <problem>
```

Downloading creates the solution template and shares samples in
`problems/<group>/<problem>/tests/`. Existing samples and solutions are preserved.
Groups use the first letter, or `0` for IDs starting with a digit.

Solution paths:
- Python: `python/<group>/<problem>.py`
- Java: `java/<group>/<problem>/Main.java`
- Rust: `rust/<group>/src/bin/<problem>.rs`

Each submission script locates a single source file and calls the root Kattis
client with `--force`, so submission does not require an extra confirmation. Java solutions must be self-contained
in `Main.java`. The language scripts share download and submission internals.
