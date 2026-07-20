use std::io;

pub fn main(){
    let stdin = io::stdin();
    let mut lines = stdin.lines();
    let line1 =  lines.next().unwrap().expect("");
    let line2 =  lines.next().unwrap().expect("");
        
    let horizontal_fold : u32 = line1.parse().unwrap();
    let vertical_fold : u32 = line2.parse().unwrap();
    
    let thickness = (horizontal_fold)*(vertical_fold);
    println!("{thickness}");

}