use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut  split = lines.next().unwrap().split_whitespace();
    let n_rows : usize = split.next().unwrap().trim().parse().unwrap();
    let n_cols : usize = split.next().unwrap().trim().parse().unwrap();
    let mut grid : Vec<Vec<char>> = Vec::new();
    for line in lines{
        let line = line.trim();
        let mut row = Vec::new();
        for c in line.chars(){
            row.push(c);
        }
        grid.push(row);
    }

    let deltas : [(i32, i32); 8] = [(1,0),(-1,0),(1,-1),(0,-1), (-1,-1), (1,1), (0,1), (-1,1)];
    let mut locations : Vec<(i32, i32)> = Vec::new();
    for j in 0..n_rows{
        for i in 0..n_cols{
            if i == 0 || i == n_cols - 1 || j == 0 || j == n_rows - 1{
                continue;
            } 
            if grid[j][i] != '0' {
                continue;
            }
            let mut is_location = true;
            for (dx,dy) in deltas{
                let x = (i as i32)+ dx;
                let y = (j as i32) + dy;
                if grid[y as usize][x as usize] != 'O'{
                    is_location = false;
                    break;
                }
            } 
            if is_location{
                locations.push(((i+1) as i32, (j+1) as i32));
            }  
        }
    }
    if locations.len() == 0 {
        println!("Oh no!")
    }
    else if locations.len() == 1 {
        let (x,y) = locations.last().unwrap();
        println!("{y} {x}");
    }
    else {
        let location_len = locations.len();
        println!("Oh no! {location_len} locations");
    }
}
