import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        
        int count = 0;
        for(int i = l; i <= h; i++){
            Set<Integer> digits = String.valueOf(i).chars().map( c-> c - '0' ).boxed().collect(java.util.stream.Collectors.toSet());
            if(digits.size() != 6) continue;
            if(digits.contains(0)) continue;
            boolean isOk = true;
            for(Integer d : digits){
                if(i%d != 0){
                    isOk = false;
                    break;
                }
            }
            if(!isOk) continue;
            count ++;
        }
        System.out.println(count);
    }
}
