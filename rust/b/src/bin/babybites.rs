use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    let n : u32 = lines.next().unwrap().unwrap().trim().parse().unwrap();
    let mut count = 1;
    let mut is_good  = true;
    for w in lines.next().unwrap().unwrap().trim().split_whitespace(){
        if w != "mumble" && w != count.to_string(){
            is_good = false;
            break;
        }
        count += 1;
    }
    let s =  if is_good {"makes sense"} else {"something is fishy"};
    println!("{s}");
}
