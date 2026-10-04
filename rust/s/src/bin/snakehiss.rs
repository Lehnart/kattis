use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let n : u32 = input.trim().parse().unwrap();

    let mut s : String = String::from("His");
    for _ in 0..n {
        s += "s";
    }
    s += "!";

    println!("{s}");
}
