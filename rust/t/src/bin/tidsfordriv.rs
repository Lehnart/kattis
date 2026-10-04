use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let n : usize = lines.next().unwrap().trim().parse().unwrap();
    let mut cards : HashMap<&str, usize> = HashMap::from([
        ("2", 4),
        ("3", 4),
        ("4", 4),
        ("5", 4),
        ("6", 4),
        ("7", 4),
        ("8", 4),
        ("9", 4),
        ("10", 4),
        ("J", 4),
        ("Q", 4),
        ("K", 4),
        ("A", 4)
    ]);

    let card_count = 52 - n;
    for line in lines{
        let mut s : String = line.trim().chars().collect();
        s.pop();
        let count = cards.get_mut(s.as_str()).unwrap();
        *count -= 1;
    }

    let m = cards.values().max().unwrap();
    let p = (*m as f64) / card_count as f64;
    println!("{p}");
}
