import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        int sum = (g-t)*9/10;
        for(int i = 0;i < n; i++){
            sum -= sc.nextInt();
        }
        sc.close();
        System.out.println(sum);
    }
}
