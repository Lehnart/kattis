import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int underscoreCount = 0;
        int lowercaseCount = 0; 
        int uppercaseCount = 0; 
        int symbolCount = 0; 
        for (char c : s.toCharArray()) {
            if (c == '_') {
                underscoreCount++;
            }
            else if (c >= 'a' && c <= 'z'){
                
                lowercaseCount++;
            }
            else if (c >= 'A' && c <= 'Z'){
                uppercaseCount++;
            }
            else symbolCount++;
        }
        System.out.println(underscoreCount/ (double)s.length());
        System.out.println(lowercaseCount/(double)s.length());
        System.out.println(uppercaseCount/(double)s.length());
        System.out.println(symbolCount/(double)s.length());
        sc.close();
    }
}
