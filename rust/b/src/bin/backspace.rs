use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut input = input.trim();
    let mut s : String = String::new();
    for c in input.chars(){
        if c == '<'{
            s.pop();
        }
        else {
            s += c.to_string().as_str();
        }
    }    
    println!("{s}");
}
