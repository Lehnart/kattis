import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        String c3 = sc.next();
        String c4 = sc.next();
        String c5 = sc.next();
        sc.close();
        Map<String, Integer> ranks = new HashMap<>();
        List<String> cards = List.of(c1, c2, c3, c4, c5);
        for(String c : cards){
            ranks.compute(
                c.substring(0,1), 
                (k,v) -> { 
                        if(v==null) return 1;
                        else return v + 1; 
                    }
            );
        }
        System.out.println(ranks.values().stream().max(Integer::compare).orElse(0));
    }
}
