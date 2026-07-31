use std::io;

fn main() {
    let mut vec  : Vec<f64> = Vec::new();
    for line in io::stdin().lines(){
        let n:f64 = line.unwrap().trim().parse().unwrap();
        vec.push(n);
    }
    let a = vec.get(0).unwrap();
    let a = a/2.;
    let V = 4. * std::f64::consts::PI * a * a *a / 6.;
    println!("{V}");
}
