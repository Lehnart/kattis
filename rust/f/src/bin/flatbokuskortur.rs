use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut vec: Vec<u32> = Vec::new();
    for raw_number in input.split("\n"){
        if let Result::Ok(number) = raw_number.trim().parse(){
            vec.push(number);
        }
    }

    let x = vec.get(0).unwrap();
    let y= vec.get(1).unwrap();
    let z = vec.get(2).unwrap();

    if x*x > (y*y)*z {
        println!("Neibb");
    }
    else {
        println!("Jebb");
    }
}
