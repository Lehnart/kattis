use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let month_map : HashMap<&str, &str> = HashMap::from([
        ("JAN", "01"),
        ("FEB", "02"),
        ("MAR", "03"),
        ("APR", "04"),
        ("MAY", "05"),
        ("JUN", "06"),
        ("JUL", "07"),
        ("AUG", "08"),
        ("SEP", "09"),
        ("OCT", "10"),
        ("NOV", "11"),
        ("DEC", "12"),
    ]);

    let mut input_splitted = input.trim().split_whitespace();
    let day:&str = input_splitted.next().unwrap().trim();
    let _isl_month = input_splitted.next().unwrap();
    let eng_month = input_splitted.next().unwrap().replace("/", "");
    let year:u32 = input_splitted.next().unwrap().trim().parse().unwrap();

    let year = 2000 + year;
    let month = month_map.get(&eng_month.as_ref()).unwrap();
    println!("{year}-{month}-{day}");
        
}
