import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Long> inputs = new ArrayList<>();
        while(sc.hasNextLong()){
            inputs.add(sc.nextLong());
        }
        sc.close();
        inputs.remove(0);
        System.out.println(inputs.stream().min(Comparator.naturalOrder()).get());
    }
}
