use std::io;

fn main() {
    let mut vec : Vec<i32> = Vec::new();
    for line in io::stdin().lines(){
        vec.push(line.unwrap().trim().parse().unwrap());
    }
    let max = vec.iter().max().unwrap();
    println!("{max}");
}
