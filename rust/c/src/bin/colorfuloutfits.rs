use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let n :usize = input.trim().parse().unwrap();
    if n % 2 == 0 {
        println!("2");
    }
    else {
        println!("3");
    }
}
