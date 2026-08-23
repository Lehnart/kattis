use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    let n : u32 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let mut v : Vec<u32> = Vec::with_capacity(n as usize);
    for r in lines.next().unwrap().unwrap().trim().split_whitespace() {
        v.push(r.parse().unwrap());   
    }
    v.sort();
    let s = v.get(0).unwrap() + v.get(1).unwrap();
    println!("{s}");
}
