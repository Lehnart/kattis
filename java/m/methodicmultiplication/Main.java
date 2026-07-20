import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        
        int i1 = 0; 
        int i2 = 0; 
        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i)=='S') i1++;
        }
        for(int i = 0 ; i < s2.length(); i++){
            if(s2.charAt(i)=='S') i2++;
        }
        int i3 = i1*i2;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < i3; i++) sb.append("S(");
        sb.append("0");
        for(int i =0; i < i3; i++) sb.append(")");
        System.out.println(sb.toString());
    }
}
