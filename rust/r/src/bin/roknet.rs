use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut inntak_map : HashMap<&str, &str> = HashMap::new();
    let mut uttak_map : Vec<&str> = Vec::new();
    let mut og_map : HashMap<&str, (&str, &str)> = HashMap::new();
    let mut eda_map : HashMap<&str, (&str, &str)> = HashMap::new();
    let mut ekki_map : HashMap<&str, &str> = HashMap::new();
    
    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    

    let mut signal_map : HashMap<&str, &str> = HashMap::new();
    
    
    for line in lines {
        let mut split = line.split_whitespace();
        let object = split.next().unwrap().trim();
        match object {
            "INNTAK" => {
                let name : &str = split.next().unwrap().trim();
                let value : &str = split.next().unwrap().trim();
                signal_map.insert(name, value);
            },
            "UTTAK" => {
                let name : &str = split.next().unwrap().trim();
                let signal = signal_map.get(name).unwrap();
                println!("{name} {signal}")
            },
            "OG" => {
                let value1 : &str = split.next().unwrap().trim();
                let value2 : &str = split.next().unwrap().trim();
                let value1 : &str = signal_map.get(value1).unwrap();
                let value2 : &str = signal_map.get(value2).unwrap();
                let name : &str = split.next().unwrap().trim();

                if value1 == "SATT" && value2 == "SATT"{
                    signal_map.insert(name, "SATT");
                }
                else {
                    signal_map.insert(name, "OSATT");
                }
            },
            "EDA" => {
                
                let value1 : &str = split.next().unwrap().trim();
                let value2 : &str = split.next().unwrap().trim();
                let value1 : &str = signal_map.get(value1).unwrap();
                let value2 : &str = signal_map.get(value2).unwrap();
                let name : &str = split.next().unwrap().trim();

                if value1 == "OSATT" && value2 == "OSATT"{
                    signal_map.insert(name, "OSATT");
                }
                else {
                    signal_map.insert(name, "SATT");
                }
            },
            "EKKI" => {
                
                let value : &str = split.next().unwrap().trim();
                let value : &str = signal_map.get(value).unwrap();
                let name : &str = split.next().unwrap().trim();
                if value == "OSATT"{
                    signal_map.insert(name, "SATT");
                }
                else {
                    signal_map.insert(name, "OSATT");
                }
            },
            r => {
                panic!("not expected gate {r}");
            }
        };
    }

}
