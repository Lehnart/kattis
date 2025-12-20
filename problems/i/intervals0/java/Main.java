import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[24];
        List<Integer> intervals = new ArrayList<>();
        for(int i = 0; i < n; i++){
            intervals.add(sc.nextInt());
            intervals.add(sc.nextInt());
        }
        for(int i = 0; i<intervals.size(); i+=2){
            for(int j=intervals.get(i); j < intervals.get(i+1); j++) arr[j]++;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >=k) sum++;
        }
        sc.close();

        System.out.println(sum);
        
    }
}
