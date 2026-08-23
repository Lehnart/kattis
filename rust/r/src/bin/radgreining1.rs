use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let mut line_split = lines.next().unwrap().trim().split_whitespace();
    let n : usize = line_split.next().unwrap().parse().unwrap();
    let r : String = "?".repeat(n);
    let mut r : Vec<char> = r.chars().collect();
    let mut is_contradictory = false;

    for line in lines{

        if is_contradictory{
            break;
        }

        let mut line_splitted = line.split_whitespace();
        let i0 : usize = line_splitted.next().unwrap().parse().unwrap();
        let s : &str = line_splitted.next().unwrap().trim();
        for (i, c) in s.chars().enumerate(){
            let index = i0+i-1;
            let current_c = r[index];
            if current_c == '?'{
                r[index] = c;
            }
            if current_c != '?' && current_c != c{
                is_contradictory = true;
            }
        }
    }

    if is_contradictory{
        println!("Villa");
    }
    else {
        let r:String = r.iter().collect();
        println!("{r}");
    }
}
