import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            Set<String> cities = new HashSet<>();
            int n = sc.nextInt();
            for(int j = 0; j < n; j++){
                cities.add(sc.next());
            }
            System.out.println(cities.size());
        }
        sc.close();
    }
}
