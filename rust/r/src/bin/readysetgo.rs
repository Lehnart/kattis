use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut split = input.split_whitespace();
    let n : u32 = split.next().unwrap().trim().parse().unwrap();
    let t : u32 = split.next().unwrap().trim().parse().unwrap();
    let r  = n - t;
    println!("{r}");
}
