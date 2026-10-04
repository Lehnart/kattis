use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : usize = lines.next().unwrap().trim().parse().unwrap();
    let mut ermits : Vec<usize> = Vec::new();
    for line in lines{
        let ermit : usize = line.trim().parse().unwrap();
        ermits.push(ermit); 
    }    
    
    let mut min : usize = usize::MAX;
    let mut min_index : usize = 0;

    for (index, ermit) in ermits.iter().enumerate(){
        if min > *ermit{
            min = *ermit;
            min_index = index;
        }
    }

    let min = min + n;
    ermits.remove(min_index);
    if ermits.iter().min().unwrap() <= &min {
        println!("impossible");
    }
    else {
        println!("{min}");
    }
}
