use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    let n : u32 = lines.next().unwrap().unwrap().parse().unwrap();
    let mut data : Vec<(u32, u32)> = Vec::new(); 
    for line in lines {
        let line_unwrapped = line.unwrap();
        let t_and_d_raw : Vec<&str> = line_unwrapped.split_whitespace().collect();
        let t : u32 = t_and_d_raw.get(0).unwrap().trim().parse().unwrap();
        let d : u32 = t_and_d_raw.get(1).unwrap().trim().parse().unwrap();
        data.push((t, d));
    }

    let mut v_max : f32 = f32::MIN; 
    for i in 0..(data.len()-1) {
        let (t0, d0) = data.get(i).unwrap();
        let (t1, d1) = data.get(i+1).unwrap();
        let v = (d1 - d0) as f32 / (t1 - t0) as f32;
        if v > v_max {
            v_max = v;
        }
    }
    let v_max : u32  = v_max as u32;
    println!("{v_max}");
}
