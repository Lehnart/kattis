import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> locationToNames = new HashMap<>();
        int n= sc.nextInt();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            String location = sc.next();
            if (!locationToNames.containsKey(location)){
                locationToNames.put(location,new ArrayList<>());
            }
            locationToNames.get(location).add(name);
        }
        sc.close();
        for(String location: locationToNames.keySet()){
            System.out.println(location + " " + locationToNames.get(location).size());
        }
    }
}
