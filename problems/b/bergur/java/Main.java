import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> days = new ArrayList<>();
        for(int i =0; i < n; i++) days.add(sc.nextInt());
        sc.close();
        int sum = days.get(days.size()-1);
        int max = days.get(days.size()-1);
        for(int i = days.size()-2; i>=0 ; i--){
            int d = days.get(i);
            if(d >= max){
                sum += max;
            } else {
                sum += d;
                max = d;
            }
        }
        System.out.println(sum);
    }
}
