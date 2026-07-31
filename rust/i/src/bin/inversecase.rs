use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let input = input.trim();

    let mut s : String = String::new();
    for c in input.chars(){
        if c.is_lowercase(){
            s += &c.to_uppercase().to_string();
        }
        else {
            s += &c.to_lowercase().to_string();
        }
    }
    println!("{s}");
}
