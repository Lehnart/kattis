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
        List<Long> temperatures = new ArrayList<>();
        for(int i = 0; i < n; i++){
            temperatures.add(sc.nextLong());
        }
        System.out.println( temperatures.stream().max(Comparator.naturalOrder()).get() + " " + temperatures.stream().min(Comparator.naturalOrder()).get());
        sc.close();
    }
}
