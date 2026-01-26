import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        sc.close();
        int xMin = Math.min(x1, x2);
        int xMax = Math.max(x1, x2);
        int yMin = Math.min(y1, y2);
        int yMax = Math.max(y1, y2);

        double bestX = ( xMin <= x && xMax >= x) ? x : ( x > xMax ? xMax : xMin ); 
        double bestY = ( yMin <= y && yMax >= y) ? y : ( y > yMax ? yMax : yMin ); 
        double d = Math.sqrt( Math.pow(x-bestX, 2) + Math.pow(y-bestY, 2) );
        System.out.println(d);
    }
}
