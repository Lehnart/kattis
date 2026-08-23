use core::f32;
use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let r : u32 = input.trim().parse().unwrap();

    let b = 2.*(r as f32)*(f32::consts::PI/4.).sin();
    println!("{b}");
}
