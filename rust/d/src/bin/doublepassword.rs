use std::io;

fn main() {
    let line1 = io::stdin().lines().next().unwrap().unwrap();
    let trimmed_line1 = line1.trim();
    let line2 = io::stdin().lines().next().unwrap().unwrap();
    let trimmed_line2 = line2.trim();
 
    let mut count = 0;
    for (c1, c2) in trimmed_line1.chars().zip(trimmed_line2.chars()) {
        if c1 != c2 {
            count += 1;
        }
    }
    let combination = 2_u32.pow(count);
    println!("{combination}");

}
