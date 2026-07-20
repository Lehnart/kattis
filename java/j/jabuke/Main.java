import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static double area(int ax, int ay, int bx, int by, int cx, int cy){
       return Math.abs( (ax*(by-cy)) + (bx*(cy-ay)) + cx*(ay-by)) /2.;
    }
    private static long sign(int px, int py, int ax, int ay, int bx, int by) {
        return (long)(px - bx) * (ay - by) - (long)(ax - bx) * (py - by);
    }

    private static boolean isInsideTriangle(int xa, int ya, int x1, int y1, int x2, int y2, int x3, int y3) {
        long d1 = sign(xa, ya, x1, y1, x2, y2);
        long d2 = sign(xa, ya, x2, y2, x3, y3);
        long d3 = sign(xa, ya, x3, y3, x1, y1);
        
        boolean hasNeg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        boolean hasPos = (d1 > 0) || (d2 > 0) || (d3 > 0);
        
        return !(hasNeg && hasPos);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int xa = sc.nextInt();
            int ya = sc.nextInt();
            if (isInsideTriangle(xa, ya, x1, y1, x2, y2, x3, y3)) {
                sum ++;
            }
        }
        sc.close();
        System.out.println(area(x1,y1,x2,y2,x3,y3));
        System.out.println(sum);
    }
}
