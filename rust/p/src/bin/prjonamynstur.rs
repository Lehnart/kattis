use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let loop_map : HashMap<char, u32> = HashMap::from([
        ('.', 20),
        ('O', 10),
        ('\\', 25),
        ('/', 25),
        ('A', 35),
        ('^', 5),
        ('v', 22)
    ]);

    let mut r : u32 = 0;
    let mut lines = input.lines();
    lines.next().unwrap();
    for line in lines{
        let line = line.trim();
        for c in line.chars(){
            r += loop_map.get(&c).unwrap();
        }
    }

    println!("{r}");
}

