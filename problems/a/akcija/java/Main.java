import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for(int i = 0; i < n; i++){
            prices.add(sc.nextInt());
        }
        prices.sort(Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0; i < prices.size(); i++){
            if((i+1)%3 == 0) continue;
            sum += prices.get(i);
        }
        sc.close();
        System.out.println(sum);
    }
}
