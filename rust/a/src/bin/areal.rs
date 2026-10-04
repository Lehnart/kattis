use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let a : f32 = input.trim().parse().unwrap();
    let p = a.sqrt() * 4. ;
    println!("{p}");
}
