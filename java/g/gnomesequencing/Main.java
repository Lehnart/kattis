import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Gnomes:");
        for(int i = 0 ; i < n; i++){
            int p = 0;
            boolean isOrdered = true;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > b && b > c) System.out.println("Ordered"); 
            else if(a < b && b < c) System.out.println("Ordered"); 
            else System.out.println("Unordered"); 
        }
        sc.close();
    }
}
