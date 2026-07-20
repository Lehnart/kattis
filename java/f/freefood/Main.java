import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] events = new boolean[366]; 
        for(int i = 0; i < 366; i++) { events[i] = false; }
        for(int i = 0 ; i < n ; i++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            for(int j = s; j <= t; j++){
                events[j] = true;
            }
        }
        sc.close();
        int sum = 0;
        for(int i = 0; i < 366; i++){
            if (events[i]) sum++;
        }
        System.out.println(sum);
    }
}
