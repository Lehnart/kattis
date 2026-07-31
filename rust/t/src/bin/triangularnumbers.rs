use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let n : u32 = input.trim().parse().unwrap();

    let mut previous : u32 = 0;
    for i in 1..=n{
        let c = previous + i;
        println!("{c}");
        previous = c;
    }
}
