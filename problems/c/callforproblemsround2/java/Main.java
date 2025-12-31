import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> difficulties = new HashSet<>();
        for(int i = 0 ; i < n; i++){
            difficulties.add(sc.nextInt());
        }
        sc.close();
        System.out.println(k < difficulties.size() ? k : difficulties.size());
    }
}
