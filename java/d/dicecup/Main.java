import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[] r = new int[41];
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= m ; j++){
                r[i+j]++;
            }
        }
        int max = Arrays.stream(r).max().getAsInt();
        for(int i = 0;i<41;i++){
            if(r[i] == max) System.out.println(i);
        }
    }
}
