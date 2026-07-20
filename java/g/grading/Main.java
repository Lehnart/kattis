import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        if(p>=a) System.out.println("A");
        else if(p>=b) System.out.println("B");
        else if(p>=c) System.out.println("C");
        else if(p>=d) System.out.println("D");
        else if(p>=e) System.out.println("E");
        else System.out.println("F");
    }
}
