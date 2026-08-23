use std::io;

// this solution doesn't work because there is an error when judging online. this might be an overflow error
// I solved this problem with a python script
fn main() {
    let mut lines = io::stdin().lines();
    let k : i128 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let n : i64 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let mut xs : Vec<u32> = Vec::with_capacity(n as usize);
    for line in lines{
        let x : u32  = line.unwrap().parse().unwrap();
        xs.push(x);
    }
    let mut s : i128 = 0;
    for x in xs{
        s += k.pow(x);
    }
    println!("{s}");
}
