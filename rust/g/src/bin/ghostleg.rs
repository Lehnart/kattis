use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let mut splitted_line = lines.next().unwrap().split_whitespace();
    let n : u32 = splitted_line.next().unwrap().trim().parse().unwrap();
    let _m : u32 = splitted_line.next().unwrap().trim().parse().unwrap();
    
    let rugs : Vec<u32> = lines.map(|l| l.trim().parse().unwrap()).collect();

    let mut results : Vec<u32> = Vec::with_capacity(n as usize);
    for a in 1..=n {
        let mut current = a;
        for r in &rugs{
            match r {
                val if *val == current  => current += 1,
                val if *val + 1 == current => current -= 1, 
                _ => {}
            }
        }
        results.push(current);
    }


    for a in 1..=n {
        for (i, v) in results.iter().enumerate(){
            if *v == a {
                println!("{}", i + 1);
            }
        }
    }
}
