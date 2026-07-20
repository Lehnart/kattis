import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String a = sc.next();
            String b = sc.next();
            Set<Character> cs = new HashSet<>();
            for(int j = 0 ; j < b.length(); j++){
                cs.add(b.charAt(j));
            }
            if( cs.stream().allMatch(c -> a.indexOf(c) != -1) ) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
