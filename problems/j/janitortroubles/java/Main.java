import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        sc.close();
        double s =(a+b+c+d) / 2.;
        System.out.println(Math.sqrt((s-a)*(s-b)*(s-c)*(s-d)));
    }
}
