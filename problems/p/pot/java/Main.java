import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        long x = 0L; 
        for(int i = 0; i < c; i++){
            long n = sc.nextLong();
            long a = Math.divideExact(n, 10);
            long b = n % 10;
            x += Math.pow(a, b);
        }
        sc.close();
        System.out.println(x);
    }
}
