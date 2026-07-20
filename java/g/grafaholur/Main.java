import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        float ratio = ( x / (float) n ) / (float) h;
        System.out.println( 1. / (ratio * m / y) );
    }
}
