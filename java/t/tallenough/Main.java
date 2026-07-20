import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        boolean isLow = false;
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            if(h<48) isLow=true;
        }
        sc.close();
        System.out.println( isLow ? "False" : "True");
    }
}
