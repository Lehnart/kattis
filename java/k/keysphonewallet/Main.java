import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> elements = new HashSet<>();
        for(int i = 0; i < n ; i++){
            elements.add(sc.next().strip());
        }
        sc.close();
        Set<String> expected = Set.of("keys", "wallet", "phone");
        if(elements.containsAll(expected)) System.out.println("ready");
        else{
            if(!elements.contains("keys")) System.out.println("keys");
            if(!elements.contains("phone")) System.out.println("phone");
            if(!elements.contains("wallet")) System.out.println("wallet");
        }
    }
}
