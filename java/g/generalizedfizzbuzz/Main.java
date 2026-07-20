import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int fizz = 0;
        int buzz = 0;
        int fizzbuzz = 0;
        for(int i = 1; i <= n; i++){
            if(i % a == 0 && i % b == 0) fizzbuzz++;
            else if(i % a == 0) fizz++;
            else if(i % b == 0) buzz++;
        }
        System.out.println( fizz + " " + buzz + " " + fizzbuzz);
    }
}
