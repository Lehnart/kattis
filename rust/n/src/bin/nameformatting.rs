use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut split_result = input.trim().split(',');
    let lastname = split_result.next().unwrap().trim();
    let firstname = split_result.next().unwrap().trim();

    let mut s : String = String::new();
    s += &firstname.chars().next().unwrap().to_uppercase().to_string();
    s += ". ";

    let mut chars = lastname.chars();
    s += (chars.next().unwrap().to_uppercase().collect::<String>() + chars.as_str()).as_str();
    println!("{s}");
}
