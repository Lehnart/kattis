use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let n : u128 = input.trim().parse().unwrap();
    print!("[");
    for i in 1..=n{
        let square = i*i;
        print!("{square}");
        if i != n {
            print!(", ");
        }
    }
    println!("]");
}
