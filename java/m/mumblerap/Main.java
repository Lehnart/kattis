import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static record Pair(Character c1, Character c2){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        String digits = s.replaceAll("[^0-9]", ".");
        int max = 0 ;
        for( String d : digits.split("\\.")){
            if (d.length() > 0 && Integer.parseInt(d) > max ) max = Integer.parseInt(d);
        }

        System.out.println(max);

    }
}
