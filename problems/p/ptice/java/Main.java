import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.next();
        sc.close();
        String adrian = "ABC";
        String bruno = "BABC";
        String goran = "CCAABB";
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch== adrian.charAt(i%adrian.length())) a++;
            if(ch==bruno.charAt(i%bruno.length())) b++;
            if(ch==goran.charAt(i%goran.length())) c++;
        }
        int max = Math.max(a,Math.max(b,c));
        System.out.println(max);
        if(a==max) System.out.println("Adrian");
        if(b==max) System.out.println("Bruno");
        if(c==max) System.out.println("Goran");
    }
}
