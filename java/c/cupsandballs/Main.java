import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer g = sc.nextInt();
        Integer n = sc.nextInt();
        int win = 2;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            if(a==win) win = b;
            else if(b==win) win = a;
        }
        if (win == g) System.out.println( (((win)%3)+1) + " " + (((win+1)%3)+1));
        else if(win == 1) System.out.println( g + " 1");
        else if(win == 2) System.out.println( g + " 2");
        else System.out.println(g + " 3");
        sc.close();
    }
} 
