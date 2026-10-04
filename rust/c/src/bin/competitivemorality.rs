use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let r : u32 = lines.next().unwrap().trim().parse().unwrap();
    let b : u32 = lines.next().unwrap().trim().parse().unwrap();

    if b + 1  < r {
        println!("RED");
    }
    else{
        println!("BLUE");

    }
}
