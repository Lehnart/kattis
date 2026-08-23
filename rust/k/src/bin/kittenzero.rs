use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let r0 : f32 = input.trim().parse().unwrap();

    let s = 1. + (r0) + (r0*r0) + (r0*r0*r0);
    let s = s.round() as u32;
    println!("{s}");

}
