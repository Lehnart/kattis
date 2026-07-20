import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            int w = sc.nextInt();
            if(w <= k) {
                k -= w;
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        sc.close();
        System.out.print("\n");
    }
}
