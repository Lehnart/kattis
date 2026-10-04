use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut w : u32 = lines.next().unwrap().trim().parse().unwrap();
    let mut n : u32 = lines.next().unwrap().trim().parse().unwrap();
    let mut v = 0;
    for line in lines {
        let mut split = line.trim().split_whitespace();
        let w : u32 = split.next().unwrap().parse().unwrap();
        let l : u32 = split.next().unwrap().parse().unwrap();
        v += w*l;
    }
    let l = v / w;
    println!("{l}");
}
