use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut recipes: Vec<u32> = Vec::new();
    for raw_number in input.split("\n"){
        if let Result::Ok(number) = raw_number.trim().parse(){
            recipes.push(number);
        }
    }

    let mut max = u32::MAX;
    for i in 0..5{
        let available = recipes.get(i+5).unwrap();
        let required = recipes.get(i).unwrap();
        if available / required < max {
            max = available / required;
        }
    }

    println!("{max}");
}
