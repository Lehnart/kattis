import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= 12; i++) {
            map.put(i, 0);
        }

        int sum = 0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                map.put(i+j, map.get(i+j)+1);
                sum++;
            }
        }

        Long[] inputs = new Long[3];
        Set<Integer> hotelPlace = new HashSet<>();
        
        Scanner sc = new Scanner(System.in);
        int hotelCount = sc.nextInt();
        while (sc.hasNextInt()) {
            hotelPlace.add(sc.nextInt());
        }
        sc.close();
        
        int value = 0;
        for(int p : hotelPlace){
            value += map.get(p);
        }

        System.out.println(value / (float) sum);
    }
}
