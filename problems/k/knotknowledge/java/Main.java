import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> knots= new HashSet<>();
        for(int i =0;i<n;i++){
            knots.add(sc.nextInt());
        }
        for(int i = 0;i<n-1;i++){
            knots.remove(sc.nextInt());
        }
        sc.close();
        System.out.println(knots.iterator().next());
    }
}
