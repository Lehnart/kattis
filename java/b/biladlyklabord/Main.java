import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        Character last = null;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if (last == null || c != last) {
                sb.append(c);
                last = c;
            }
        }
        System.out.println(sb.toString());
    }
}
