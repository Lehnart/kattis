import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long i1 = sc.nextLong();
        long i2 = sc.nextLong();
        sc.close();
        long result = i1 / i2;
        System.out.println(result + 2022);
    }
}
