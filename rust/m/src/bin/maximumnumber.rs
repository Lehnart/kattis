use std::io;

fn main() {
    let mut max: i64 = i64::MIN;
    for line in io::stdin().lines() {
        let a : i64 = line.unwrap().trim().parse().unwrap();
        if a > max{
            max = a;
        }
    }
    println!("{max}");
}
