use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let input = input.trim();
    let s = input;
    let rs: String = s.chars().rev().collect();
    if s == rs {
        println!("Palindrome!");
    }
    else {
        println!("Nothing special about this string :(");
    }
}
