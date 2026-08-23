use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    let mut min : u32 = u32::MAX;
    for r in lines.next().unwrap().split_whitespace(){
        let i = r.trim().parse().unwrap();
        if i < min {
            min = i ;
        }
    }
    let min = min + 1;
    println!("{min}");
}
