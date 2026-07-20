use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let year : u32 = input.trim().parse().expect("");
    if year == 1984 {
        println!("Literally 1984");
    }
    else {
        println!("Not 1984... yet");
    }
}
