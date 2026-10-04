use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let cs = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'];
    let mut ais : Vec<char> = input.trim().chars().collect();
    ais.sort();
    ais.dedup();

    let mut ai_index : usize = 0;
    let mut miss : String = String::new();
    for c in cs {
        if ai_index >= ais.len() || ais[ai_index] != c {
            miss += c.to_string().as_str();
        }
        else{
            ai_index += 1;
        }
    }

    if miss != "" {
        println!("{miss}");
    }
    else{
        println!("Good job!");
    }
}
