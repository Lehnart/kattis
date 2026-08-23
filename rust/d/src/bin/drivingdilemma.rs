use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let s : u32 = lines.next().unwrap().trim().parse().unwrap();
    let d : f32 = lines.next().unwrap().trim().parse().unwrap();
    let t : f32 = lines.next().unwrap().trim().parse().unwrap();

    if  (s as f32) >=  (d / 5280.) /  (t/3600.)  {
        println!("MADE IT");
    }
    else {
        println!("FAILED TEST");
    }

}
