import subprocess
import os 

inputs = ["..\\res\\input1.txt","..\\res\\input2.txt","..\\res\\input3.txt"]
outputs = ["..\\res\\output1.txt","..\\res\\output2.txt","..\\res\\output3.txt"]

for index in range(len(inputs)):
    input_file = inputs[index]
    output_file = outputs[index]
    result_file = "result.txt"

    with open(input_file, "r") as f, open(result_file, "w") as r :
        subprocess.run("java ..\\java\\Main.java", stdin=f, stdout=r)

    with open(output_file, "r") as o, open(result_file, "r") as r :
        output_content = o.read()
        result_content = r.read()
        print(output_content)
        print(result_content)
        assert output_content == result_content

os.remove("result.txt")