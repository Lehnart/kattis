import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> words = new ArrayList<>();
        for(int i = 0 ; i<count; i++){
            words.add(sc.next());
        }
        sc.close();
        for(int i = 0 ; i < words.size(); i+=2){
            System.out.println(words.get(i));
        }
    }
}
