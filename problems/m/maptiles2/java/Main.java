import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        sc.close();
        int level = 0;
        int x = 0;
        int y = 0;
        for(int i = r.length()-1; i >= 0; i--){
            Character c = r.charAt(i);
            if(c == '1' || c =='3') x += (int) (Math.pow(2,level));
            if(c == '2' || c =='3') y += (int) (Math.pow(2,level));
            level++;
        }
        System.out.println(r.length() + " " + x + " " + y);
    }
}
