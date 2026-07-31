use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let stdin = io::stdin();
    let mut lines = stdin.lines();

    let line1 =  lines.next().unwrap().expect("");
    let n_and_m : Vec<u32> = line1.split_ascii_whitespace().map(|i| i.parse().unwrap()).collect();      
    let n = n_and_m.get(0).unwrap();
    let m = n_and_m.get(1).unwrap();
    
    let mut dices: Vec<u32> = Vec::new();

    for line in lines {
        let dice : u32 = line.expect("").trim().parse().unwrap();         
        dices.push(dice);
    }

    let mut dice_map = HashMap::new();
    for dice in dices{
        let entry = dice_map.entry(dice).or_insert(0);
        *entry += 1;
    }

    let mut max_value = 0;
    for (key, value) in dice_map.into_iter(){
        if value > max_value{
            max_value = value;
        }
    }

    if max_value + *m >= *n {
        println!("Ja");
    }
    else {
        println!("Nej");
    }
}
