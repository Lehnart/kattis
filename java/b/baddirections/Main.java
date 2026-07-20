import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int k = sc.nextInt();
            int d = sc.nextInt();
            String s = String.valueOf(d);
            String ns = "";
            for(int j = 0 ; j < s.length(); j++){
                int digit = Character.getNumericValue(s.charAt(j));
                int newDigit = (digit + k) % 10;
                ns += String.valueOf(newDigit);
            }
            System.out.println(ns);

        }
        sc.close();

    }
}
