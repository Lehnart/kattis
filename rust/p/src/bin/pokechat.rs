use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let key : Vec<char> = lines.next().unwrap().trim().chars().collect();
    let msg = lines.next().unwrap().trim().to_string();
    let mut r = String::new();
    for i in (0..(msg.len())).step_by(3){
        let index: usize  = (&msg[i..(i+3)]).parse().unwrap();
        r += key[index-1].to_string().as_str(); 
    }
    println!("{r}");
}
