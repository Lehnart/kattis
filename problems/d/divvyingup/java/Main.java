import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prizes = new ArrayList<>();
        for(int i = 0; i < n; i++){
            prizes.add(sc.nextInt());
        }
        sc.close();
        int sum = prizes.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum % 3 == 0 ? "yes" : "no");
    }
}
