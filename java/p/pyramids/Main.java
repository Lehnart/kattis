import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        int n = 1;
        int blocks = 1;
        while(true){
            blocks += ((2*(n+1))-1)*((2*(n+1))-1);
            if (blocks>c){break;}
            n++;
        }
        System.out.println(n);
    }
}
