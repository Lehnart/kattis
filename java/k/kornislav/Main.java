import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args){
        List<Integer> ints = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ints.add(sc.nextInt());
        ints.add(sc.nextInt());
        ints.add(sc.nextInt());
        ints.add(sc.nextInt());
        sc.close();
        ints.sort(Comparator.naturalOrder());
        System.out.println(ints.get(2)*ints.get(0));
    }
}
