use std::{collections::HashSet, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut vec_w: Vec<&str> = Vec::new();
    let mut set_w: HashSet<&str> = HashSet::new();
    
    for w in input.trim().split_whitespace(){
        vec_w.push(w);
        set_w.insert(w);
    }

    if vec_w.len() != set_w.len(){
        println!("no");
    }
    else{
        println!("yes");
    }
}

