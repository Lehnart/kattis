import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        if (y< 2021) System.out.println("1000");
        else System.out.println( 1000 + ((y-2020) * 100) );
    }

}
