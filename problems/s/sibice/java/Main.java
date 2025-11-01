import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        double max = Math.sqrt((w*w) + (h*h));
        for(int i = 0; i < count; i++){
            int l = sc.nextInt();
            if (l <= max) System.out.println("DA");
            else System.out.println("NE");
        }
        sc.close();
    }
}
