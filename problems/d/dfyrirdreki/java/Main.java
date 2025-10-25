import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int delta = (b*b) - (4*a*c);
        if (delta>0){
            System.out.println(2);
        }
        if (delta<0){
            System.out.println(0);
        }
        if ( delta == 0 ){
            System.out.println(1);
        }
    }
}
