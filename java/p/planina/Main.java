import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long r = 2;
        int i = 0;
        while(i < n){
            r +=  r-1;
            i++;
        }
        System.out.println(r*r);
    }
}
