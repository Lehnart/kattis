use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let n : i64 = input.trim().parse().unwrap();

    let cube = n*n*n;
    println!("{cube}");
}
