use std::{collections::HashMap, io};

fn main() {
    let mut lines = io::stdin().lines();
    let n_words : u32 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let binding = lines.next().unwrap().unwrap();
    let mut words = binding.trim().split_whitespace();
    let dict_size : u32 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let mut dict: HashMap<String, String> = HashMap::with_capacity(dict_size as usize);
    for line in lines {
        let line = line.unwrap();
        let mut words = line.trim().split_whitespace();
        let key = words.next().unwrap();
        let value: &str = words.next().unwrap();
        dict.insert(key.to_string(), value.to_string());
    }

    let mut s = String::new();
    for w in words{
        s += dict.get(w).unwrap();
        s += " ";
    }
    println!("{s}");
}
