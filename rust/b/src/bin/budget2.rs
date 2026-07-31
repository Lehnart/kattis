use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    let a : i64 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let b : i64 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let c : i64 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let d : i64 = lines.next().unwrap().unwrap().trim().parse().unwrap();

    let s = a - b - c - d;
    if s < 0 {
        println!("Budget is insufficient.");
    }
    else {
        println!("Budget is sufficient.");
    }

}
