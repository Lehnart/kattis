import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < c.length(); i++) {
            char ch = Character.toLowerCase(c.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
            }
        }
        System.out.println(count);
    }
}
