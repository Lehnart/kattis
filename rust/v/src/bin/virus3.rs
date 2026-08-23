use std::{io::{self, Read}, ops::Index};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let l = lines.next().unwrap().trim();
    let mut v = lines.next().unwrap().trim();

    let mut is_virus : bool = true;
    for c in l.chars(){
        let optional_index = v.find(c);
        if optional_index.is_none(){
            is_virus = false;
            break;
        }
        else {
            let index = optional_index.unwrap() + 1;
            v = v.get(index..).unwrap();
        }
    }
    if is_virus{
        println!("Ja");
    }
    else {
        println!("Nej");
    }
}
