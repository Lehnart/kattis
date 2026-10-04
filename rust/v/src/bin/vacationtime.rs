use std::{
    cmp::Reverse,
    collections::BinaryHeap,
    io::{self, Read},
};

fn dijkstra(start: usize, graph: &[Vec<(usize, u64)>]) -> Vec<u64> {
    let mut dist = vec![u64::MAX; graph.len()];
    let mut heap = BinaryHeap::new();

    dist[start] = 0;
    heap.push(Reverse((0_u64, start)));

    while let Some(Reverse((current_dist, current))) = heap.pop() {
        // Entrée périmée dans la heap
        if current_dist != dist[current] {
            continue;
        }

        for &(next, cost) in &graph[current] {
            let new_dist = current_dist + cost;

            if new_dist < dist[next] {
                dist[next] = new_dist;
                heap.push(Reverse((new_dist, next)));
            }
        }
    }

    dist
}

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut input = input.split_whitespace();

    let a: usize = input.next().unwrap().parse().unwrap();
    let f: usize = input.next().unwrap().parse().unwrap();

    let mut graph = vec![Vec::new(); a];
    let mut reverse_graph = vec![Vec::new(); a];

    let mut a380_flights = Vec::new();

    for _ in 0..f {
        let origin: usize = input.next().unwrap().parse().unwrap();
        let destination: usize = input.next().unwrap().parse().unwrap();
        let cost: u64 = input.next().unwrap().parse().unwrap();
        let model = input.next().unwrap();

        graph[origin].push((destination, cost));
        reverse_graph[destination].push((origin, cost));

        if model == "A380" {
            a380_flights.push((origin, destination, cost));
        }
    }

    // Meilleur coût de 0 vers chaque aéroport
    let from_start = dijkstra(0, &graph);

    // Meilleur coût de chaque aéroport vers A-1
    // grâce au graphe inversé.
    let to_end = dijkstra(a - 1, &reverse_graph);

    let mut answer = u64::MAX;

    for (origin, destination, cost) in a380_flights {
        if from_start[origin] == u64::MAX || to_end[destination] == u64::MAX {
            continue;
        }

        let total =
            from_start[origin]
            + cost
            + to_end[destination];

        answer = answer.min(total);
    }

    if answer == u64::MAX {
        println!("-1");
    } else {
        println!("{answer}");
    }
}