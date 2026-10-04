use core::{f64};
use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let r : f64 = input.trim().parse().unwrap();
    let a0  : f64 = r*r* f64::consts::PI;
    let b0 : f64 = r*r*2.;
    println!{"{a0}"};
    println!{"{b0}"};
}
