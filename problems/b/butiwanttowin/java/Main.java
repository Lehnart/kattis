import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> votes = new ArrayList<>();
        for(int i =0; i < n; i++) votes.add(sc.nextInt());
        sc.close();
        votes.sort((a, b) -> Integer.compare(b, a));
        int turn = 0;
        while(true){
            if(
                votes.stream().max(Integer::compareTo).get() == votes.get(1) 
                && votes.get(1) > (votes.stream().mapToInt(Integer::intValue).sum() / 2.0)
            ){
                System.out.println(turn);
                break;
            }
            if (votes.size() == 2){
                System.out.println("IMPOSSIBLE TO WIN");
                break;
            }
            votes.set(1, votes.get(1) + votes.remove(votes.size()-1));
            turn ++;
        }
    }
}
