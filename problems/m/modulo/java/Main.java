import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 10 ; i++){
            numbers.add(sc.nextInt()%42);
        }
        sc.close();
        System.out.println(numbers.size());
    }
}
