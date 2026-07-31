use std::io;

fn main() {  
    let mut vec: Vec<i32> = Vec::new();
    for line in io::stdin().lines(){
        vec.push( line.unwrap().trim().parse().unwrap() );
    }
    for i in (0..vec.len()).step_by(2){
        let a = vec.get(i).unwrap();
        let b = vec.get(i+1).unwrap();
        let r= 10*a*b;
        println!("{r}");
    }
}
