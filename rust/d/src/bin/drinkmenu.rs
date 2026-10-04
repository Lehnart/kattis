use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut split = lines.next().unwrap().trim().split_whitespace();
    let n : usize = split.next().unwrap().parse().unwrap();
    let m : usize = split.next().unwrap().parse().unwrap();

    let mut menu : Vec<&str> = Vec::new();
    let mut customer_map : HashMap<&str, usize> = HashMap::new();
    for _ in 0..n{
        let i = lines.next().unwrap().trim();
        menu.push(i);
    }
    for _ in 0..m{
        let i = lines.next().unwrap().trim();
        if !customer_map.contains_key(i){
            customer_map.insert(i, 0);
        }
        let index = customer_map.get_mut(i).unwrap();
        let drink = menu[*index];
        println!("{drink}");
        *index += 1;
    }

}
