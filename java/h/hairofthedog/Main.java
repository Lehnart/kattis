import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> states = new ArrayList<>();
        for(int i = 0; i < n; i++){
            states.add(sc.next());
        }
        sc.close();
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(states.get(i).equals("drunk") && states.get(i+1).equals("sober")){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
