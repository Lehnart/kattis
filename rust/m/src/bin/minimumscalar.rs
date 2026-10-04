use std::io::{self, Read};

fn permutations(values: &mut Vec<i64>, start: usize, result: &mut Vec<Vec<i64>>) {
    if start == values.len() {
        result.push(values.clone());
        return;
    }

    for i in start..values.len() {
        values.swap(start, i);
        permutations(values, start + 1, result);
        values.swap(start, i);
    }
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let n : usize =  lines.next().unwrap().trim().parse().unwrap();
    for i in 0..n{
        let d : usize = lines.next().unwrap().trim().parse().unwrap();
        let mut v1 : Vec<i64> = Vec::with_capacity(d);
        let mut v2 : Vec<i64> = Vec::with_capacity(d);
        let split1 = lines.next().unwrap().trim().split_whitespace();
        let split2 = lines.next().unwrap().trim().split_whitespace();
        for x1 in split1{
            v1.push(x1.trim().parse().unwrap());
        }
        for x2 in split2{
            v2.push(x2.trim().parse().unwrap());
        }
        
        let mut min : i64 = i64::MAX;
        
        let perms : &mut Vec<Vec<i64>> = &mut Vec::with_capacity(d*d*d);
        let values : &mut Vec<i64> = &mut Vec::new();
        for i in 0..d {
            values.push(i as i64);
        }
        permutations(values, 0, perms);

        for i1 in 0..perms.len() {
            for i2 in 0..perms.len(){

                let perm1 = &perms[i1];
                let perm2 = &perms[i2];
                let mut s : i64 = 0; 
                for j in 0..d{
                    let index1 = perm1[j];
                    let index2 =  perm2[j];
                    s += v1[index1 as usize] * v2[index2 as usize];
                }
                if s < min {
                    min = s;
                }
            }
        }

        let case = i + 1 ;
        println!("Case #{case}: {min}");
    }
}
