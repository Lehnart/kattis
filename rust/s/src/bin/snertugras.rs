use std::collections::HashSet;
use std::io::{self, Read};
 use std::process::exit;
fn get_c(x : usize, y:usize, grid : &Vec<Vec<char>>) -> Option<char> {
    Some(*grid.get(y)?.get(x)?)
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let mut split = lines.next().unwrap().trim().split_whitespace();
    let h : usize = split.next().unwrap().parse().unwrap(); 
    let w : usize = split.next().unwrap().parse().unwrap();

    let mut grid : Vec<Vec<char>> = Vec::new();

    for line in lines {
        let mut row : Vec<char> = Vec::new();
        for c in line.chars(){
            row.push(c);
        }
        grid.push(row);
    } 

    let mut x0 : usize = 0; 
    let mut y0 : usize = 0; 
    for y in 0..h {
        for x in 0..w {
            let c = grid.get(y).unwrap().get(x).unwrap();
            if *c == 'S' {
                x0 = x; 
                y0 = y; 
            }
        }
    }

    let mut nexts : Vec<(usize, usize, usize)>= vec![(x0,y0,0)];
    let mut visited : HashSet<(usize, usize)> = HashSet::new();

    while !&nexts.is_empty(){
        let mut nnexts : Vec<(usize, usize, usize)> = Vec::new();
        for p in &nexts{
            let (x,y, count) = p;
            let (x,y,count) = (*x, *y, *count);
            let new_count = count+1;

            if y != 0 {
                let t = get_c(x, y-1, &grid);
                if t.is_some(){
                    if t.unwrap() == 'G'{
                        println!("{new_count}");
                        exit(0);
                    }
                    if  t.unwrap() != '#' && !visited.contains(&(x, y-1)){
                        nnexts.push( (x , y-1, new_count) );
                        visited.insert((x, y-1));
                    }
                }

            }

            let b = get_c(x, y+1, &grid);
            if b.is_some(){
                if b.unwrap() == 'G'{
                    println!("{new_count}");
                    exit(0);
                }
                if  b.unwrap() != '#'  && !visited.contains(&(x, y+1)){
                    nnexts.push( (x , y+1, new_count) );
                    visited.insert((x, y+1));
                }
            }

            let r = get_c(x+1, y, &grid);
            if r.is_some(){
                if r.unwrap() == 'G'{
                    println!("{new_count}");
                    exit(0);
                }
                if  r.unwrap() != '#'  && !visited.contains(&(x+1, y)){
                    nnexts.push( (x+1 , y, new_count) );
                    visited.insert((x+1, y));
                }

                
            }

            if x != 0 {
                let l = get_c(x-1, y, &grid);
                if l.is_some(){
                    if l.unwrap() == 'G'{
                        println!("{new_count}");
                        exit(0);
                    }
                    if  l.unwrap() != '#'  && !visited.contains(&(x-1, y)){
                         nnexts.push( (x-1 , y, new_count) );
                         visited.insert((x-1, y));
                    }                  
                }

            }
        }
        nexts.clear();
        nexts.extend(nnexts);
    }

    println!("thralatlega nettengdur");
}
