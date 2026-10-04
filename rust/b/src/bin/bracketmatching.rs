use std::{collections::HashMap, hash::Hash, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut stack : Vec<char> = Vec::new();
    
    let mut lines = input.trim().lines();
    let n : usize = lines.next().unwrap().parse().unwrap();
    let s = lines.next().unwrap();

    let mut is_invalid = false;
    for c in s.chars(){
        match c {
            '(' | '[' | '{' => {
               stack.push(c);
            },

            ')' | ']' | '}' => {
                let c = match c {
                    ')' => '(',
                    ']' => '[',
                    '}' => '{',
                    _ => 'a'
                };
                let c0 = stack.pop();
                if c0.is_none() || c0.unwrap() != c {
                    is_invalid = true;
                    break;
                }
                 
            },
            _ => ()
        };
    }

    if !stack.is_empty(){
        is_invalid = true;
    }

    if is_invalid{
        println!("Invalid");
    }
    else {
        println!("Valid");
    }
}
