import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        List<Integer> ints = new ArrayList<>();
        while(sc.hasNextInt()){
            ints.add(sc.nextInt());
        }
        sc.close();
        int index = ints.indexOf(j);
        if (index == 0) System.out.println("fyrst");
        else if (index == 1) System.out.println("naestfyrst");
        else System.out.println( (index + 1) + " fyrst" );
        
    }
}
