use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut count_0 = 0;
    let mut count_1 = 0;
    for c in input.chars(){
        match c {
            '0' => {
                count_0 += 1;
            }
            '1' => {
                count_1 += 1;
            }
            _ => {} 
        }
    }
    println!("{count_0} {count_1}");
}
