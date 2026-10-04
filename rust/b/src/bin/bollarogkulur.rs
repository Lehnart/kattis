use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();

    let mut swaps : [(usize, usize); 5] = [(0,0);5];

    let mut positions : [usize; 3] = [0;3];
    positions[0] = 1; 
    positions[1] = 2; 
    positions[2] = 3;

    for i in 0..5{
        let s1 : usize = lines.next().unwrap().trim().parse().unwrap();
        let s2 : usize = lines.next().unwrap().trim().parse().unwrap();
        let i1 : usize = s1 - 1;
        let i2 : usize = s2 - 1;
        swaps[i] = (s1,s2);
        let temp = positions[i1];
        positions[i1] = positions[i2];
        positions[i2] = temp;
    }

    if positions[0] == 1{
        println!("1");
    }
    else if positions[1] == 1 {
        println!("2");
    }
    else {
        println!("3");
    }
}
