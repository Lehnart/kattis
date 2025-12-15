import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Pair(Character c1, Character c2){}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> positions = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            String s = sc.next();
            positions.add(new Pair(s.charAt(0), s.charAt(1)));
        }
        sc.close();

        int sum = 0;
        for(int i = 0 ; i < n-1; i++){
            Pair p1 = positions.get(i);
            Pair p2 = positions.get(i+1);
            sum += Math.abs(p1.c1 - p2.c1) + Math.abs(p1.c2 - p2.c2);   
        }
        System.out.println(sum);
    }
}
