import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int budget = 0;
        for(int i = 0; i < count; i++){
            String s = sc.next();
            budget += sc.nextInt();
        }
        sc.close();
        if(budget==0)System.out.println("Lagom");
        if(budget>0)System.out.println("Usch, vinst");
        if(budget<0)System.out.println("Nekad");
    }
}
