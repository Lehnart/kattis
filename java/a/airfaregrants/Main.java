import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            prices.add(sc.nextInt());
        }
        sc.close();
        Integer max = prices.stream().max(Integer::compareTo).get();
        Integer min = prices.stream().min(Integer::compareTo).get();
        System.out.println( (min - (max/2)) < 0 ? 0 : (min - (max/2)) );
    }
}
