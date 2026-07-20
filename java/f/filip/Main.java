import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        sc.close();
        a = Integer.parseInt(new StringBuilder(a.toString()).reverse().toString());
        b = Integer.parseInt(new StringBuilder(b.toString()).reverse().toString());
        if(a>b) System.out.println(a);
        else System.out.println(b);
    }

}
