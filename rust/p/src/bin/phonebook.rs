use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    let n : u32 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let mut c = 0;
    for line in lines{
        let line_str = line.unwrap();
        let line_str = line_str.trim();
        if line_str.contains("+39") && (line_str.len() == 12 || line_str.len() == 13){
            c += 1;
        }
    }
    println!("{c}");
}
