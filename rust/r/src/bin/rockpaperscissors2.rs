use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();
    let mut lines = input.lines();
    let player1 = lines.next().unwrap().trim();
    let player2 = lines.next().unwrap().trim();

    if player1 == "rock"{
        if player2 == "rock" {
            println!("Draw");
        }

        if player2 == "scissors" {
            println!("Player 1");
        }

        if player2 == "paper" {
            println!("Player 2");
        }
    }
    if player1 == "scissors"{
        if player2 == "rock" {
            println!("Player 2");
        }

        if player2 == "scissors" {
            println!("Draw");
        }

        if player2 == "paper" {
            println!("Player 1");
        }
    }
    if player1 == "paper"{
        if player2 == "rock" {
            println!("Player 1");
        }

        if player2 == "scissors" {
            println!("Player 2");
        }

        if player2 == "paper" {
            println!("Draw");
        }
    }
}
