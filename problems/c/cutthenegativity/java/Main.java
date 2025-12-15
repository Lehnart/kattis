import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        List<List<Integer>> flights = new ArrayList<>();
        for(int i = 0; i < n; i++){
            flights.add(new ArrayList<>());
            List<Integer> currentFlights = flights.getLast();
            for(int j = 0; j < n ; j++){
                currentFlights.add(sc.nextInt());
            }
        }
        sc.close();
        
        int count = 0;
        for(int u = 0; u< n; u++){
            for(int v = 0; v<n; v++){
                if(flights.get(u).get(v) == -1) continue;
                count ++;
            }
        }
        System.out.println(count);
        for(int u = 0; u< n; u++){
            for(int v = 0; v<n; v++){
                if(flights.get(u).get(v) == -1) continue;
                System.out.println((u+1) + " " +(v+1) +  " " + flights.get(u).get(v));
            }
        }
    }
}
