import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine().strip();
        String d = sc.nextLine().strip();
        sc.close();
        String s = c + d;
        char[] chars = s.toCharArray();
        java.util.Arrays.sort(chars);
        System.out.println(new String(chars));
    }
}
