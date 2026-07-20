import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer p = sc.nextInt();
        Integer s = sc.nextInt();
        for(int i = 0; i < s; i++){
            int m = sc.nextInt();
            List<Integer> cards = new ArrayList<>();
            for(int j = 0; j < m; j++){
                cards.add(sc.nextInt());
            }
            if (cards.contains(p)) System.out.println("KEEP");
            else System.out.println("REMOVE");
        }
        sc.close();
    }

}
