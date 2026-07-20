import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static record Mine(int x, int y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        List<Mine> mines = new ArrayList<>();
        for(int y = 0 ; y < h; y++){
            String next = sc.next();
            for(int x = 0; x < w; x++){
                if ( next.charAt(x) == '*' ){
                    mines.add(new Mine(y+1, x+1));
                }
            }
        }
        sc.close();
        System.out.println(mines.size());
        for(Mine mine : mines){
            System.out.println(mine.x + " " + mine.y);
        }
    }
}
