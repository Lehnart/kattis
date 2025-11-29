import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int sumA = 0;
        int sumB = 0 ; 
        for(int i = 0; i < s.length(); i+=2){
            if(s.charAt(i) == 'A'){
                sumA += Integer.valueOf(s.charAt(i+1));
            }
            else sumB += Integer.valueOf(s.charAt(i+1));
        }
        if (sumA > sumB) System.out.println("A");
        else System.out.println("B");
    }
}
