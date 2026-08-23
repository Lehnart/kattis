use std::io;

fn main() {
    for line in io::stdin().lines(){
        let mut line = line.unwrap();
        let mut count_0 = 0;
        let mut count_1 = 0;
        let mut is_even_parity = false;
        for c in line.chars(){
            match c {
                '0' => count_0 += 1,
                '1' => count_1 += 1,
                'e' => is_even_parity = true, 
                _ => continue
            }
        }

        if is_even_parity{
            if count_1 % 2 != 0 {
                line = line.trim().replace("e", "1");
            }
            else {
                line = line.trim().replace("e", "0");
            }
        }
        else {
            if count_1 % 2 == 0 {
                line = line.trim().replace("o", "1");
            }
            else {
                line = line.trim().replace("o", "0");
            }
        }
        
        if line == "#"{
            continue;
        }
        println!("{line}");
    }
}
