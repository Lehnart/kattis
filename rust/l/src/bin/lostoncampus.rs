use std::collections::VecDeque;
use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut lines = input.lines();

    let mut dimensions = lines.next().unwrap().split_whitespace();
    let width: usize = dimensions.next().unwrap().parse().unwrap();
    let height: usize = dimensions.next().unwrap().parse().unwrap();

    let grid: Vec<Vec<u8>> = lines
        .take(height)
        .map(|line| line.as_bytes().to_vec())
        .collect();

    let mut start = None;

    for y in 0..height {
        for x in 0..width {
            if grid[y][x] == b'*' {
                start = Some((x, y));
            }
        }
    }

    let (start_x, start_y) = start.expect("Start position not found");

    let mut distances = vec![vec![u32::MAX; width]; height];
    distances[start_y][start_x] = 0;

    let mut queue = VecDeque::new();
    queue.push_front((start_x, start_y));

    let directions = [
        (1isize, 0isize),
        (-1, 0),
        (0, 1),
        (0, -1),
    ];

    while let Some((x, y)) = queue.pop_front() {
        let current_distance = distances[y][x];

        for &(dx, dy) in &directions {
            let next_x = x as isize + dx;
            let next_y = y as isize + dy;

            if next_x < 0
                || next_y < 0
                || next_x >= width as isize
                || next_y >= height as isize
            {
                continue;
            }

            let next_x = next_x as usize;
            let next_y = next_y as usize;

            let cell = grid[next_y][next_x];

            if cell == b'#' {
                continue;
            }

            let cost = if cell == b'D' { 1 } else { 0 };
            let new_distance = current_distance + cost;

            if new_distance < distances[next_y][next_x] {
                distances[next_y][next_x] = new_distance;

                if cost == 0 {
                    queue.push_front((next_x, next_y));
                } else {
                    queue.push_back((next_x, next_y));
                }
            }
        }
    }

    let mut answer = u32::MAX;

    for y in 0..height {
        for x in 0..width {
            if grid[y][x] == b'E' {
                answer = answer.min(distances[y][x]);
            }
        }
    }

    if answer == u32::MAX {
        println!("NOT POSSIBLE");
    } else {
        println!("{answer}");
    }
}