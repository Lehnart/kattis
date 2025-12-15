import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ingredients = new ArrayList<>();
        int capacity = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            capacity -= sc.nextInt();
            capacity += sc.nextInt();
            if(capacity > max) max = capacity;
        }
        sc.close();
        System.out.println(max);
    }
}
