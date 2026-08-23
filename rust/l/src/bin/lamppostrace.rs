use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let _n : u32 = lines.next().unwrap().trim().parse().unwrap();

    let mut p = 0_u32; 
    let mut s = 0_u32;
    
    for d in lines.next().unwrap().trim().split_whitespace(){
        let d : u32 = d.parse().unwrap();
        if d > p {
            s += d-p;
            p = d;
        }
        else{
            s += p-d;
            p = d;
        }
    }
    println!("{s}");
}
