use std::io;

fn main() {
    let line1_vec : Vec<u32> = io::stdin().lines().next().unwrap().unwrap().split_whitespace().map(|c| c.parse().unwrap()).collect();
    let line2_vec : Vec<u32> = io::stdin().lines().next().unwrap().unwrap().split_whitespace().map(|c| c.parse().unwrap()).collect();
    let k = *line1_vec.get(1).unwrap();
    let mut s : String = String::from("");
    for i in ((k - 1) as usize..line2_vec.len()).step_by(k as usize){
        let number = line2_vec.get(i).unwrap();
        s += &number.to_string();
        s += " ";
    }
    let s_trimmed = s.trim();
    println!("{s_trimmed}");
}
