use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    let m : u32 = lines.next().unwrap().trim().parse().unwrap();
    if n >  m {
        println!("Dufur passa ekki");
    }
    else if n == m {
        println!("Dufur passa fullkomlega");
    }
    else {
        println!("Dufur passa");
    }
}
