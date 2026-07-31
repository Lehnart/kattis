use std::io::{self};

fn main() {
    let stdin = io::stdin();
    let mut lines = stdin.lines();
    let line1 =  lines.next().unwrap().expect("");
    let n : u32 = line1.parse().expect("");
    let mut ingredient_list = Vec::new();

    for line in lines {
        let ingredients : Vec<u32> = line.expect("").split_ascii_whitespace().map(|i| i.parse().unwrap()).collect();         
        ingredient_list.push(ingredients);
    }
    
    let mut sum = 0_u32;
    for ingredient_items in ingredient_list{
        let count_available = ingredient_items.get(0).expect("");
        let count_needed = ingredient_items.get(1).expect("");
        let cost = ingredient_items.get(2).expect("");
        if count_needed > count_available {
            sum += (count_needed - count_available) * cost;
        }
    }

    println!("{sum}");
}
