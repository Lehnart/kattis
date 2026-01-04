import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        do{
            System.out.println( (n/m) + " " + (n%m) + " / " + m );
            n = sc.nextInt();
            m = sc.nextInt();
        } while(n != 0 && m != 0);
        sc.close();
    }
}
