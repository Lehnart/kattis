import subprocess
import os 
import pathlib
import sys

args = sys.argv[1:]
letter = args[0] if len(args) > 0 else None 

os.chdir("problems")
letters = os.listdir() if letter is None else [letter]

for letter in letters :
    os.chdir(letter)
    problems = os.listdir()
    for problem in problems :
        print("Running tests for " + problem)
        os.chdir(problem)

        if not os.path.isdir("res"):
            os.chdir("..")
            continue 

        test_files = os.listdir("res")
        inputs = [f for f in test_files if f.startswith("input")]
        outputs = [f for f in test_files if f.startswith("output")]
        inputs.sort()
        outputs.sort()

        for index in range(len(inputs)):
            input_file = pathlib.Path("res", inputs[index])
            output_file = pathlib.Path("res", outputs[index])
            result_file = "result.txt"

            with open(input_file, "r") as f, open(result_file, "w") as r :
                subprocess.run("java java\\Main.java", stdin=f, stdout=r)

            with open(output_file, "r") as o, open(result_file, "r") as r :
                output_content = o.read()
                result_content = r.read()
                try :
                    assert output_content == result_content
                except AssertionError :
                    print("expected ", output_content)
                    print("result ", result_content)
                    exit()

            os.remove("result.txt")
        os.chdir("..")
    os.chdir("..")