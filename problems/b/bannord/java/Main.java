import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letters = sc.next();
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            String s = sc.next();
            if(letters.chars().anyMatch(c -> s.indexOf(c) >= 0)){
                sb.append("*".repeat(s.length()));
            } else {
                sb.append(s);
            }
            sb.append(" ");
        }
        sc.close();
        System.out.println(sb);

    }
}
