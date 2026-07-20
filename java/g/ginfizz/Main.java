import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer c = sc.nextInt();
        sc.close();
        System.out.println((c*45) + " ml gin");
        System.out.println((c*30) + " ml fresh lemon juice");
        System.out.println((c*10) + " ml simple syrup");
        System.out.println((c*1) + " slice" + (c > 1 ? "s" : "") + " of lemon");
    }
}
