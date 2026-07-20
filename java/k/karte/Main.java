import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static List<Character> cardKinds = List.of('P','K','H','T');
    public static void main(String[] args){
        Map<Character, List<Integer>> cards = new HashMap<>();
        for(Character c : cardKinds) cards.put(c, new ArrayList<>());
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        for(int i = 0; i < data.length(); i+=3){
            Character c = data.charAt(i);
            if(!cards.containsKey(c)) cards.put(c, new ArrayList<>());
            cards.get(c).add(Integer.parseInt(data.substring(i+1, i+3)));
        }
        sc.close();
        if (cardKinds.stream().anyMatch(c -> cards.get(c).size() != new HashSet<>(cards.get(c)).size())) System.out.println("GRESKA");
        else{
            boolean isFirst = true;
            for(Character c : cardKinds){
                if(!isFirst) System.out.print(" ");
                isFirst = false;
                System.out.print(13 - (cards.get(c).size()));
            }
            System.out.println();
        } 
    }
}
