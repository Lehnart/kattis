import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        Map<Integer, Integer> monthToDays = new HashMap<>();
        monthToDays.put(1, 31);
        monthToDays.put(2, 28);
        monthToDays.put(3, 31);
        monthToDays.put(4, 30);
        monthToDays.put(5, 31);
        monthToDays.put(6, 30);
        monthToDays.put(7, 31);
        monthToDays.put(8, 31);
        monthToDays.put(9, 30);
        monthToDays.put(10, 31);
        monthToDays.put(11, 30);
        monthToDays.put(12, 31);
        System.out.println(monthToDays.get(input));
    }
}
