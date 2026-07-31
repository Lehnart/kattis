use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let vec : Vec<i64> = input.lines().map(|s| s.trim()).map(|x| x.parse().unwrap()).collect();
    let s = vec.get(0).unwrap() * vec.get(1).unwrap();
    println!("{s}");
}
