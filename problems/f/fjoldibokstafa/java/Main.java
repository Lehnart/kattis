import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String lower = s.toLowerCase();
        int count = 0;
        for (char ch : lower.toCharArray()) {
            if(ch >= 'a' && ch <= 'z'){
                count ++;
            }
        }
        System.out.println(count);
    }
}
