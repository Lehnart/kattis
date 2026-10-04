use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let _n : u32 = lines.next().unwrap().trim().parse().unwrap();
    
    let mut proc_parts : HashMap<u32, u32> = HashMap::from([
        (0,0),
        (1,0),
        (2,0)
    ]);
    for line in lines {
        let split = line.trim().split_whitespace();
        for (index, c) in split.enumerate(){
            if c == "J"{
                let index = index as u32;
                *proc_parts.get_mut(&index).unwrap() += 1;
            }
        }
    }
    let r = proc_parts.values().min().unwrap();
    println!("{r}");
}
