use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let n : u128 = input.trim().parse().unwrap();
    if n % 3 == 0 {
        println!("Jebb");
    }
    else {
        println!("Neibb");
    }
}   
