import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int a = sc.nextInt();
        sc.close();
        long sum = 0;
        for(int i = 1; i<=a; i++){
            sum += (i*(1+i)) / 2;
        }
        System.out.println( (a*(1+a)) / 2 );
        System.out.println(sum);
    }
}
