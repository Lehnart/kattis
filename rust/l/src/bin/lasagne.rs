use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let t_f : f32 = input.trim().parse().unwrap();
    let t_c = (t_f-32.) * (5./9.);
    let t_c: i32 = t_c.round() as i32;
    println!("{t_c}");
}
