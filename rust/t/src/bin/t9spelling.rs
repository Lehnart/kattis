use std::{collections::HashMap, io::{self, Read}};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let t9_map : HashMap<char, &str> = HashMap::from([
        ('a',"2"),
        ('b',"22"),
        ('c',"222"),
        ('d',"3"),
        ('e',"33"),
        ('f',"333"),
        ('g',"4"),
        ('h',"44"),
        ('i',"444"),
        ('j',"5"),
        ('k',"55"),
        ('l',"555"),
        ('m',"6"),
        ('n',"66"),
        ('o',"666"),
        ('p',"7"),
        ('q',"77"),
        ('r',"777"),
        ('s',"7777"),
        ('t',"8"),
        ('u',"88"),
        ('v',"888"),
        ('w',"9"),
        ('x',"99"),
        ('y',"999"),
        ('z',"9999"),
        (' ',"0"),
    ]);

    let mut lines = input.lines();
    let n : u32 = lines.next().unwrap().trim().parse().unwrap();
    for i in 1..=n {
        let line = lines.next().unwrap();
        print!("Case #{i}: ");
        let mut previous_digit = 'a';
        for c in line.chars(){
            let s = t9_map.get(&c).unwrap().to_string();
            let d = s.chars().next().unwrap();
            if d == previous_digit {
                print!(" ");
            }
            previous_digit = d;
            print!("{s}");
        }
        println!("");
    } 
}