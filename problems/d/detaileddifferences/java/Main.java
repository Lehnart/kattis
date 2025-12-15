import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n ; i++){
            String s1 = sc.nextLine().strip();
            String s2 = sc.nextLine().strip();
            System.out.println(s1);
            System.out.println(s2);
            for(int j = 0; j < s1.length(); j++){
                Character c1 = s1.charAt(j);
                Character c2 = s2.charAt(j);
                if(c1.equals(c2)) System.out.print(".");
                else System.out.print("*");
            }
            System.out.print("\n");
            System.out.print("\n");
        }
        sc.close();
    }
}
