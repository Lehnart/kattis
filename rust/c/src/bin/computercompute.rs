use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let x0 : f64 = lines.next().unwrap().trim().parse().unwrap();
    let y0 : f64 = lines.next().unwrap().trim().parse().unwrap();
    let x1 : f64 = lines.next().unwrap().trim().parse().unwrap();
    let y1 : f64 = lines.next().unwrap().trim().parse().unwrap();

    let dx = (x0 - x1).powf(2.); 
    let dy = (y0 - y1).powf(2.);
    let d = (dx + dy).sqrt();
    println!("{d}"); 
}
