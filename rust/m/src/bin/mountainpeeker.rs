use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    let y0 : i32 = lines.next().unwrap().trim().parse().unwrap();
    let x0 : i32 = 0;

    let mut pos_vec : Vec<(i32, i32)> = Vec::new();
    let mut neg_vec : Vec<(i32, i32)> = Vec::new();
    
    for line in lines {
        let mut split = line.trim().split_whitespace();
        let x : i32 = split.next().unwrap().parse().unwrap();
        let y : i32 = split.next().unwrap().parse().unwrap();
        if x > 0 {
            pos_vec.push((x,y));
        }
        else {
            neg_vec.push((x,y));
        }
    }  
    pos_vec.sort_by_key(|x| x.0);
    neg_vec.sort_by_key(|x| x.0);

    let mut count = 0;

    for (x,y) in pos_vec{

    }

}
