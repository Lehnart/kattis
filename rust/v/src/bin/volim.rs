use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let k : usize = lines.next().unwrap().trim().parse().unwrap();
    let n : usize = lines.next().unwrap().trim().parse().unwrap();
    let mut current_index = k;
    let mut current_t : u32 = 0;

    for line in lines{
        let mut split = line.trim().split_whitespace();
        let t : u32 = split.next().unwrap().parse().unwrap(); 
        let s : &str = split.next().unwrap(); 
        current_t += t;
        if current_t > 210 {
            println!("{current_index}");
            break;
        }
        if s == "T"{
            current_index += 1;
            if current_index > 8 {
                current_index = 1;
            }
        }
    }
}
