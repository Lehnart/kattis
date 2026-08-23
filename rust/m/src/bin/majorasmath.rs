use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();

    let mut split = lines.next().unwrap().split_whitespace();
    let h : i32 = split.next().unwrap().trim().parse().unwrap();
    let n : usize = split.next().unwrap().trim().parse().unwrap();

    let mut split = lines.next().unwrap().split_whitespace();
    let a : u32 = split.next().unwrap().trim().parse().unwrap();
    let b : u32 = split.next().unwrap().trim().parse().unwrap();
    let c : u32 = split.next().unwrap().trim().parse().unwrap();
    let d : u32 = split.next().unwrap().trim().parse().unwrap();

    let mut damage : u32 = 0;
    for line in lines{
        let line = line.trim().to_string();
        match line.as_str() {
            "standard" => damage += a, 
            "fire" => damage += b, 
            "ice" => damage += c, 
            "light" => damage += d, 
            _ => continue
        }
    }
    let r = h - (damage as i32);
    if r <= 0 {
        println!("dead");
    }
    else {
        println!("{r}");
    }
}
