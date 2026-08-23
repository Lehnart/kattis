use std::io;

fn main() {
    let mut lines = io::stdin().lines();
    loop {
        let line1 = match lines.next(){
            Some(r) => r.unwrap(),
            None => break
        };
        let line2 = match lines.next(){
            Some(r) => r.unwrap(),
            None => break
        };

        if line1.contains("E"){
            break;
        }
        
        let mut p1 = 0;
        let mut p2 = 0;
        for (c1, c2) in line1.chars().zip(line2.chars()){
            if c1 == 'R' && c2 == 'S'{
                p1 +=1;
            }
            if c1 == 'S' && c2 == 'P'{
                p1 +=1;
            }
            if c1 == 'P' && c2 == 'R'{
                p1 +=1;
            }
            if c2 == 'R' && c1 == 'S'{
                p2 +=1;
            }
            if c2 == 'S' && c1 == 'P'{
                p2 +=1;
            }
            if c2 == 'P' && c1 == 'R'{
                p2 +=1;
            }
        }
        println!("P1: {p1}");
        println!("P2: {p2}");

    }
}
