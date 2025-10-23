import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        sc.close();
        if(x2 == x1 || y2 == y1){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }
}
