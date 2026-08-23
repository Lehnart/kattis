use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let raw : Vec<&str> = input.split_whitespace().collect();
    let title = raw.get(0).unwrap().to_string();
    let title_len = title.len() as f64;
    let cost : f64 = raw.get(1).unwrap().parse().unwrap();
    let min = cost.min(title_len);
    println!("{min}");
}
