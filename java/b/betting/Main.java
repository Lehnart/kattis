import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        System.out.println(100./i);
        System.out.println(100./(100-i));
        
    }
}
