use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let mut toktik_map: HashMap<&str, u64> = HashMap::new();
    let n : usize = lines.next().unwrap().trim().parse().unwrap();
    for line in lines {
        let mut splitted_line = line.trim().split_whitespace();
        let name :&str = splitted_line.next().unwrap();
        let count :u64 = splitted_line.next().unwrap().parse().unwrap();
        if !toktik_map.contains_key(name){
            toktik_map.insert(name, 0);
        }
        let mut c = toktik_map.get_mut(name).unwrap();
        *c += count;
    }
    let mut max = 0_u64;
    let mut max_name = "";
    for name in toktik_map.keys(){
        let v = toktik_map.get(name).unwrap();
        if *v > max {
            max = *v;
            max_name = name;
        }
    }
    println!("{max_name}");
}
