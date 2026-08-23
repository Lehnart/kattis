use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : i64 = lines.next().unwrap().trim().parse().unwrap();
    let _m : i64 = lines.next().unwrap().trim().parse().unwrap();
    let lines = lines.skip(1);
    let mut current : i64 = 1;
    let mut min : i64 = 1;
    let mut max : i64 = 1;
    for line in lines{
        let note : i64 = line.trim().parse().unwrap();
        current += note;
        if current < min {
            min = current;
        }
        if current > max {
            max = current;
        }
    }
    let min_note = 2 - min;
    let max_note = n - max + 1;

    if min_note > n || max_note < 1  || max_note < min_note {
        println!("finns ingen");
    }
    else{
        println!("{min_note}");
    }
}
