import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Map<Set<Integer>, Integer> map = new HashMap<>(10000);
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=0; j < 5;j++){
                set.add(sc.nextInt());
            }
            if(!map.containsKey(set)) map.put(set, 0);
            int l = map.get(set)+1;
            map.put(set,l);
            if(l==max) sum += max;
            if (l>max) {
                max = l;
                sum = max;
            }
        }
        sc.close();    

        System.out.println(sum);
    }
}