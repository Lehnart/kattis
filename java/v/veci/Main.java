import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public record QueueElement(String current, List<Character> lefts) {}

    static List<Integer> generateLargerCombination(String s){
        List<Integer> rs = new ArrayList<>();

        List<QueueElement> queue = new ArrayList<>();
        queue.add(new QueueElement("", s.chars().mapToObj(c -> (char)c).toList()));
        List<QueueElement> nexts = new ArrayList<>();
        while(!queue.stream().allMatch(q -> q.lefts().isEmpty())){
            for(QueueElement p : queue){
                String current = p.current();
                List<Character> lefts = p.lefts();
                for(int i = 0; i < lefts.size(); i++){
                    String nextCurrent = current + lefts.get(i);
                    int sValue = Integer.parseInt(s.substring(0, nextCurrent.length()));
                    int nextCurrentValue = Integer.parseInt(nextCurrent);
                    if(nextCurrentValue >= sValue){
                        List<Character> rem = new ArrayList<>(lefts);
                        rem.remove(i);
                        nexts.add(new QueueElement(nextCurrent, rem));
                    }
                }
            }
            queue = new ArrayList<>(nexts);  
            nexts.clear();
        }
        for(QueueElement p : queue){
            int r = Integer.parseInt(p.current());
            if(r>Integer.parseInt(s)){
                rs.add(r);
            }
        }
        return rs;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String s = String.valueOf(n);
        List<Integer> results = generateLargerCombination(s);
        results.sort(Comparator.naturalOrder());
        System.out.println( results.isEmpty() ? 0 : results.get(0));
    }
}
