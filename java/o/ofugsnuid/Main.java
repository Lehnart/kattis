import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> ints = new ArrayList<>();
        for(int i = 0 ; i<count; i++){
            ints.add(sc.nextInt());
        }
        sc.close();
        for(int i = ints.size()-1; i >= 0; i--){
            System.out.println(ints.get(i));
        }
    }
}
