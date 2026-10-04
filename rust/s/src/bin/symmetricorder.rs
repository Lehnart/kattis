use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let mut counter = 1;
    loop {
        let n : usize = lines.next().unwrap().trim().parse().unwrap();
        if n == 0 {
            break;
        }
        let mut vec : Vec<&str> = Vec::with_capacity(n);
        for i in 0..n {
            let s=  lines.next().unwrap().trim();
            if i == 0 || i == 1 {
                vec.push(s);
            }
            else if i % 2 == 1 {
                let index = vec.len() - ((i-1)/2);
                vec.insert(index, s);
            }
            else{
                let index = i/2;
                vec.insert(index, s);
            }
        }
        println!("SET {counter}");
        for s in vec{
            println!("{s}");
        }
        counter +=1;
    }
}
