use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut split = input.trim().split_whitespace();
    let r : u32 = split.next().unwrap().trim().parse().unwrap();
    let g : u32= split.next().unwrap().trim().parse().unwrap();
    let b : u32= split.next().unwrap().trim().parse().unwrap();
    if r > g && r > b {
        println!("raudur");
    }
    else if g > r && g > b {
        println!("graenn");
    }
    else if b > r && b > g {
        println!("blar");
    }
    else if r == g && b < r && b < g {
        println!("gulur");
    } 
    else if r == b && g < r && g < b {
        println!("fjolubleikur");
    } 
    else if g == b && r < g && r < b {
        println!("blagraenn");
    } 
    else if g == 0 && r == 0 && b == 0 {
        println!("svartur");
    } 
    else if g == 255 && r == 255 && b == 255 {
        println!("hvitur");
    } 
    else if g == r && b == r {
        println!("grar");
    } 
    else {
        println!("othekkt");
    }
}
