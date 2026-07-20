import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static record Cup(int r, String c){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Cup> cups = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            int r = 0;
            String c = "";
            String s1 = sc.next();
            String s2 = sc.next();
            try {
                r = Integer.parseInt(s1)/2;
                c = s2; 
            } catch (NumberFormatException e) {
                r = Integer.parseInt(s2);
                c = s1;
            }
            cups.add(new Cup(r,c));
        }
        cups.sort((cup1, cup2) -> Integer.compare(cup1.r(), cup2.r()));
        for(Cup cup : cups){
            System.out.println(cup.c);   
        }
    }
}
