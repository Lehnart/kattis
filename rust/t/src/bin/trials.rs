use std::io;

fn main() {
    let mut vec  : Vec<f64> = Vec::new();
    for line in io::stdin().lines(){
        let n:f64 = line.unwrap().trim().parse().unwrap();
        vec.push(n);
    }
    let a = vec.get(0).unwrap();
    let b = vec.get(1).unwrap();
    let c = vec.get(2).unwrap();
    let s = (a+b+c) / 2_f64;
    let A = f64::sqrt((s*(s-a)*(s-b)*(s-c)) as f64);
    println!("{A}");
}
