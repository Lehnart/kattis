use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut stocks: Vec<i64> = Vec::new();
    for raw_number in input.split("\n"){
        if let Result::Ok(number) = raw_number.trim().parse(){
            stocks.push(number);
        }
    }

    let simmer = stocks.get(1).unwrap();
    let mut i = 2;
    let mut max_diff = i64::MIN;
    while i + simmer < stocks.len() as i64 {
        let d0 = stocks.get(i as usize).unwrap();
        let d1 = stocks.get((i + simmer) as usize).unwrap();
        let diff : i64 = d1 - d0;
        if diff > max_diff{
            max_diff = diff;
        }
        i+=1;
    }
    println!("{max_diff}");
}
