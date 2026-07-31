use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let input = input.trim();
    let mut s : String = String::new();
    for (i, c) in input.chars().enumerate(){
        if i % 2 == 1 {
            continue;
        }
        s += &c.to_string();
    }

    println!("{s}");
}
