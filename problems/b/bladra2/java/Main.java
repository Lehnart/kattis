import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static record Gift(int price, String name){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();;
        int a = sc.nextInt();;
        int t = sc.nextInt();;
        sc.close();
        System.out.println((v*t) + 0.5d*(a*t*t));
    }
}
