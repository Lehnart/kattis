import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < c; i++){
            String s = sc.next();
            String io = sc.next();
            int n = sc.nextInt();
            if (io.equals("IN")) map.merge(s, n,  (a,b) -> a+b );
            else map.merge(s, n,  (a,b) -> a-b );
        }
        sc.close();

        int s = map.values().stream().mapToInt(Integer::intValue).sum();
        if(s==0) System.out.println("NO STRAGGLERS");
        else System.out.println(s);
    }
}
