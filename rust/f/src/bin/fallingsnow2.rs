use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let line = lines.next().unwrap();
    let mut line_splitted = line.split_whitespace();
    let row_count : usize = line_splitted.next().unwrap().trim().parse().unwrap();
    let col_count : usize = line_splitted.next().unwrap().trim().parse().unwrap();

    let mut count_by_col : HashMap<usize, usize> = HashMap::new();
    for col in 0..col_count{
        count_by_col.insert(col, 0_usize);
    }

    for (_, line) in lines.enumerate(){
        let line = line.trim();
        for (col, c) in line.chars().enumerate(){
            if c=='S' {
                let col_count : &mut usize = count_by_col.get_mut(&col).unwrap();
                *col_count += 1;
            }
        } 
    }

    let mut r = String::new();
    for row in 0..row_count{
        for col in 0..col_count{
            let snow_in_colum = count_by_col.get(&col).unwrap();
            let height = row_count - row;
            if *snow_in_colum >= height {
                r += "S";
            }
            else {
                r += ".";
            }
        }
        r += "\n";
    }

    print!("{r}");
}
