use std::io::{self, Read};

fn pgcd(a:u32, b:u32) -> u32{
    if a == b {
        return a;
    }

    if a > b {
        let mut r = a % b;
        let mut a0 = a;
        let mut b0 = b;
        while r != 0 {
            a0 = b0;
            b0 = r;
            r = a0 % b0;
        }
        return b0;
    }

    let mut r = b % a;
    let mut a0 = b;
    let mut b0 = a;
    while r != 0 {
        a0 = b0;
        b0 = r;
        r = a0 % b0;
    }
    return b0;
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : usize = lines.next().unwrap().trim().parse().unwrap();
    let split = lines.next().unwrap().trim().split_whitespace();
    let mut vec : Vec<u32> = Vec::with_capacity(n);
    for s in split{
        vec.push(s.trim().parse().unwrap());
    }

    let r0 = vec[0];
    for i in 1..vec.len(){
        let r1 = vec[i];
        let d = pgcd(r0, r1);
        let a = r0 / d;
        let b = r1 / d; 
        println!("{a}/{b}");
    }
}
