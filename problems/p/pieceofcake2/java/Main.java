import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        sc.close();
        int v1 = 4 * h * v;
        int v2 = 4 * (n-h) * v;
        int v3 = 4 * h * (n-v);
        int v4 = 4 * (n-h) * (n-v);
        System.out.println(Math.max(v1,Math.max(v2,Math.max(v3, v4))));
    }
}
