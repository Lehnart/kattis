use std::{collections::HashSet, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let input = input.trim();
    let vowels : HashSet<char> = HashSet::from(['a','e','i','o','u', ]);
    let char_vec : Vec<char> = input.chars().collect();
    let mut decoded_char_vec = Vec::with_capacity(char_vec.len());
    let mut ignoring = 0;
    for (i,c) in char_vec.iter().enumerate(){

        if ignoring > 0 {
            ignoring -= 1;
            continue
        }
        decoded_char_vec.push(*c);
        if vowels.contains(c){
            let nc = char_vec.get(i+1);
            if nc.is_some(){
                let nc = nc.unwrap();
                if *nc == 'p' {
                    let nnc = char_vec.get(i+2);
                    if nnc.is_some() && nnc.unwrap() == c {
                        ignoring = 2;
                    }
                }
            }
        }
    }
    let s :String = decoded_char_vec.into_iter().collect();
    println!("{s}");
}
