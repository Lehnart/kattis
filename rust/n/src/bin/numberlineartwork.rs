use std::io::{self, Read};

struct Node {
    value: String,
    next: Option<usize>,
    prev: Option<usize>,
}

struct Arm{
    pos: usize
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let mut split = lines.next().unwrap().trim().split_whitespace();
    let _n_arms : u32 = split.next().unwrap().parse().unwrap();
    let _n_actions : u32 = split.next().unwrap().parse().unwrap();

    let colors :Vec<&str> = lines.next().unwrap().trim().split_whitespace().collect();
    let mut color_nodes : Vec<Node> = Vec::new();
    let mut arms : Vec<Arm> = Vec::new();
    
    for (i , color) in colors.iter().enumerate(){
        let mut prev: Option<usize> = None;
        if i > 0{
            prev = match colors.get(i-1) {
                Some(_) => Some(i-1) ,
                None => None
            };            
        }
        let next : Option<usize> = match colors.get(i+1) {
            Some(_) => Some(i+1) ,
            None => None
        };
        
        color_nodes.push( Node { value: color.to_string(), next: next, prev: prev });
        arms.push( Arm{ pos: i});
    }

    for action in lines {
        let mut split = action.trim().split_whitespace();
        let arm_index : usize = split.next().unwrap().parse().unwrap();
        let action : &str = split.next().unwrap();
        
        let arm = &mut arms[arm_index];
        match action{
            "R" => {
                let color_index = arm.pos;
                let color_node = &color_nodes[color_index];
                let next_index = color_node.next.unwrap();
                arm.pos = next_index;
            }
            "L" => {
                let color_index = arm.pos;
                let color_node = &color_nodes[color_index];
                let prev_index = color_node.prev.unwrap();
                arm.pos = prev_index;
            }
            _ => {
                let color_index = arm.pos;
                let len = color_nodes.len();
                let prev_color_node =  color_nodes[color_index].prev;
                color_nodes.push( Node{ value : action.to_string(), next : Some(color_index), prev : prev_color_node });
                
                let color_node = &mut color_nodes[color_index];
                color_node.prev = Some(len);

                let color_node = &mut color_nodes[prev_color_node.unwrap()];
                color_node.next = Some(len);
                arm.pos = len;
            }
        }
    }

    let mut color_node = &color_nodes[0];
    let mut r = String::new();
    loop{
        r += color_node.value.as_str();
        r += " ";
        let next = color_node.next;
        if next.is_none(){
            break;
        }
        let next = next.unwrap();
        color_node = &color_nodes[next];
    }
    let r = r.trim();
    println!("{r}");

}
