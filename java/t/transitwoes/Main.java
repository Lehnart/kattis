import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int s = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> walks = new ArrayList<>();
        for(int i = 0; i <n+1; i++){
            walks.add(sc.nextInt());
        }
        List<Integer> bus = new ArrayList<>();
        for(int i = 0; i <n; i++){
            bus.add(sc.nextInt());
        }
        List<Integer> arrivals = new ArrayList<>();
        for(int i = 0; i <n; i++){
            arrivals.add(sc.nextInt());
        }
        sc.close();
        int time = s + walks.get(0);
        for(int i = 0; i < n; i++){
            if( ! (time % arrivals.get(i) == 0)){
                time += arrivals.get(i) - (time % arrivals.get(i));
            }
            time += bus.get(i);
            time += walks.get(i+1);
        }
        System.out.println( time <= t ? "yes" : "no");
    }
}
