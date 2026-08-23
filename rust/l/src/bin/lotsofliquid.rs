use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().parse().unwrap();
    let vec : Vec<f64> = lines.next().unwrap().split_whitespace().map(|f| f.trim()).map(|f| f.parse::<f64>().unwrap()).collect(); 
    let s : f64 = vec.iter().map(|f| f*f*f).sum();
    let s = s.powf(1./3.);
    println!("{s}");
}
