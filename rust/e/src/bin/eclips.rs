use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    
    let mut output : String = String::new();
    for word in input.split_whitespace(){
        if word.contains('e'){
            output += word;
            output += " ";
        }
    }
    let output = output.trim();
    if output.is_empty(){
        println!("oh noes");
    }
    else {
        println!("{output}");
    }
}
