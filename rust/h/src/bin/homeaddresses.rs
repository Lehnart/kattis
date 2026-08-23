use std::io;

fn main() {

    let mut address_inputs: Vec<String> = Vec::new();
    let mut addresses: Vec<String> = Vec::new();
    let mut numbers: Vec<String> = Vec::new();
    let mut lines = io::stdin().lines();

    loop {
        let input = lines.next().unwrap().unwrap().trim().to_string();
        if input == "q" {
            break
        }
        address_inputs.push(input.clone());
        let mut input_split = input.split_whitespace();
        addresses.push(input_split.next().unwrap().to_string());
        numbers.push(input_split.next().unwrap().to_string());
    }
    
    print!("[");
    for (i, a) in address_inputs.iter().enumerate(){
        print!("'{a}'");
        if i != address_inputs.len()-1{
            print!(", ")
        }
    }
    println!("]");

    print!("[");
    for i in 0..address_inputs.len(){
        let a = addresses.get(i).unwrap();
        let b = numbers.get(i).unwrap();
        print!("('{a}', '{b}')");
        if i != address_inputs.len()-1{
            print!(", ")
        }
    }
    println!("]");
}
