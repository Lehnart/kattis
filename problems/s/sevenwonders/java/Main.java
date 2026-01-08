import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        sc.close();
        Map<Character, Integer> map = new HashMap<>();
        map.put('T', 0);
        map.put('C', 0);
        map.put('G', 0);
        for(int i = 0 ; i < data.length(); i++){
            map.put(data.charAt(i), map.get(data.charAt(i)) + 1);
        }
        int sum= 0;
        for(Integer value: map.values()){sum += value*value;}
        sum += map.values().stream().min(Comparator.naturalOrder()).get() * 7 ;
        System.out.println(sum);
    }

}
