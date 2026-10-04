use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    let mut w : u32 = 1;
    let mut l : u32 = 1;
    let mut h : u32 = 3;
    if n == 1 {
        w = lines.next().unwrap().trim().parse().unwrap();
        l = w;
        h = 3;        
    }
    else if n == 2 {
        w = lines.next().unwrap().trim().parse().unwrap();
        l = lines.next().unwrap().trim().parse().unwrap();
        h = 3;

    }
    else if n == 3 {
        w = lines.next().unwrap().trim().parse().unwrap();
        l = lines.next().unwrap().trim().parse().unwrap();
        h = lines.next().unwrap().trim().parse().unwrap();
    }
    let mut sum = 0;
    sum += 2*w*h;
    sum += 2*(l-2)*h;
    sum += (l-2)*(w-2);
    println!("{sum}");
}
