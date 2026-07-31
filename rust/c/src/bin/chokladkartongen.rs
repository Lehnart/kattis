use std::io;

fn main() {
    let n : u32 = io::stdin().lines().next().unwrap().unwrap().trim().parse().unwrap();
    let chocolate_pieces : Vec<u32> = io::stdin().lines().next().unwrap().unwrap().split_whitespace().map(|c| c.parse().unwrap()).collect();
    let mut  last_pieces = u32::MAX;
    let mut count = 0;
    for pieces in chocolate_pieces{
        if pieces > last_pieces{
            count += 1;
        }
        last_pieces = pieces;
    }

    println!("{count}");
}
