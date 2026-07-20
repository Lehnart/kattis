import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long d = sc.nextLong();
        sc.close();
        long result = ( (d + 5) * 3 ) - 10;
        System.out.println(result);
    }
}
