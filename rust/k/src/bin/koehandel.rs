use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut split = input.trim().split_whitespace();
    let c : u32 = split.next().unwrap().trim().parse().unwrap();
    let n : u32 = split.next().unwrap().trim().parse().unwrap();

    if c > n {
        println!("0");
    }
    else if c == n {
        println!("{c}");
    }
    else{
        let r = c+1;
        println!("{r}");
    }
}
