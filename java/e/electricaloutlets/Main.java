import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int k = sc.nextInt();
            int sum = 1;
            for(int j = 0; j < k; j++){
                int o = sc.nextInt();
                sum += o - 1;
            }
            System.out.println(sum);
        }
    }
}
