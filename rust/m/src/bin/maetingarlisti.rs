use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let line = lines.next().unwrap();
    let mut split = line.trim().split_whitespace();
    let n : u32 = split.next().unwrap().trim().parse().unwrap();
    let r : u32 = split.next().unwrap().trim().parse().unwrap();
    let c : u32 = split.next().unwrap().trim().parse().unwrap();
    let mut rows : Vec<Vec<String>> = Vec::new(); 
    for _ in 0..r{
        rows.push(Vec::new());
    }
    for i in 0..r{
        let vec = rows.get_mut(i as usize).unwrap();
        let line = lines.next().unwrap();
        let split = line.trim().split_whitespace();
        for name in split{
            vec.push(name.to_string());
        }
    }
    let mut names : Vec<String> = Vec::new();
    for line in lines{
        let line = line.trim();
        names.push(line.to_string());
    }

    for (row_index, row) in rows.iter().enumerate(){
        let name_index = row_index * c as usize;
        let name = names.get(name_index).unwrap();
        if name == row.get(0).unwrap() {
            println!("left");
        }
        else{
            println!("right");
        }
    }

}
