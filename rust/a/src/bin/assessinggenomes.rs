use std::io::{self, Read};

fn get_rep(genes:&str) -> usize {
    for i in 1..251{
        if genes.len() % i != 0{
            continue;
        } 
        let s = &genes[..i];
        let repet = genes.len() / s.len();
        let mut is_good = true;
        for j in 0..repet {
            let i0 = j*s.len(); 
            let i1 = (j+1)*s.len(); 
            let subgene = &genes[i0..i1];
            if subgene != s{
                is_good = false;
                break;
            }
        }
        if is_good {
            let si = s.len();
            return si
        }
    }
    return 50
}


fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();
    let n : usize =  lines.next().unwrap().parse().unwrap();
    let mut vec_a : Vec<usize> = Vec::with_capacity(n);   
    let mut vec_b : Vec<usize> = Vec::with_capacity(n);  

    for _ in 0..n{
        let genes = lines.next().unwrap().trim();
        let r = get_rep(genes);
        vec_a.push(r);
    } 
    for _ in 0..n{
        let genes = lines.next().unwrap().trim();
        let r = get_rep(genes);
        vec_b.push(r);
    } 

    vec_a.sort_unstable();
    vec_b.sort_unstable();

    let min: i64 = vec_a.iter().zip(&vec_b).map(|(&a, &b)| {
        let diff = a as i64 - b as i64;
        diff * diff
    }).sum();
    println!("{min}");
}

