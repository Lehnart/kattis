import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static record Problem(int n, int d, int m, List<Integer> ints){}

    public static record Path(Set<Integer> visitedIndices, int currentIndex){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        String stack = sc.next();
        sc.close();
        Character ch = c.charAt(0);
        String cs = ch.toString();
        if(stack.contains(cs)){
            System.out.println("Unnar fann hana!");
        }
        else{
            System.out.println("Unnar fann hana ekki!");
        }
    }
}