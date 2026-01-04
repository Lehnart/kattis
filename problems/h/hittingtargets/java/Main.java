import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static record Rectangle(int x1, int y1, int x2, int y2){
        public boolean isIn(int x, int y){
            if(x >= x1 && x <= x2 && y >= y1 && y <= y2) return true;
            return false; 
        }

    };
    
    public static record Circle(int x, int y, int r){
        public boolean isIn(int x, int y){
            double d = Math.sqrt( Math.pow(this.x-x ,2.) + Math.pow(this.y -y, 2.));
            if (d<=r) return true;
            return false;
        }
    };

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Rectangle> rects = new HashSet<>();
        Set<Circle> circles = new HashSet<>();
        int m = sc.nextInt();
        for(int i = 0;i < m; i++){
            if(sc.next().equals("rectangle")){
                rects.add(new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
            else{
                circles.add(new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
        }

        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int count = 0 ;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(Rectangle r : rects){
                if (r.isIn(x, y)) count ++;
            }
            for(Circle c : circles){
                if(c.isIn(x, y)) count++;
            }
            System.out.println(count);
        }
        sc.close();

    }
}
