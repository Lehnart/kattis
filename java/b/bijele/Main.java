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
        int f = sc.nextInt();
        sc.close();
        int ea = 1;
        int eb = 1;
        int ec = 2;
        int ed = 2;
        int ee = 2;
        int ef = 8;
        
        int ra = ea - a;
        int rb = eb - b;
        int rc = ec - c;
        int rd = ed - d;
        int re = ee - e;
        int rf = ef - f;
        System.out.println(ra + " " + rb + " " + rc + " " + rd + " " + re + " " + rf);
    }
}
