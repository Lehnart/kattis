import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            if(sc.nextInt() < 0) sum ++;
        }
        sc.close();
        System.out.println(sum);
    }
}
