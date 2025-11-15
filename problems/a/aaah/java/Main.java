import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().strip();
        String b = sc.nextLine().strip();
        sc.close();
        if(a.length()>= b.length()) System.out.println("go");
        else System.out.println("no");
    }
}
