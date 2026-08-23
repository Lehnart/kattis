use std::{collections::HashSet, io::{self, Read}, process::exit};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    
    let mut line_split = lines.next().unwrap().split_whitespace();
    let n : u32 = line_split.next().unwrap().trim().parse().unwrap();
    let m : u32 = line_split.next().unwrap().trim().parse().unwrap();
    
    let mut puzzle_set: HashSet<u32> = HashSet::new();
    for line in lines {
        for raw in line.split_whitespace().skip(1){
            let p :u32 = raw.trim().parse().unwrap();
            puzzle_set.insert(p);
        }
    }
    for i in 1..=m{
        if ! puzzle_set.contains(&i){
            println!("Neibb");
            exit(0);
        }
    }
    println!("Jebb");

}
