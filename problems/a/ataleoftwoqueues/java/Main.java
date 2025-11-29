import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumN = 0;
        int sumM = 0;
        for(int i = 0; i < n; i++) sumN += sc.nextInt();
        for(int i = 0; i < m; i++) sumM += sc.nextInt();
        sc.close();
        if(sumN < sumM) System.out.println("left");
        else if(sumN > sumM) System.out.println("right");
        else System.out.println("either");
    }
}
