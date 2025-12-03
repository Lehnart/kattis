import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> times = new ArrayList<>();
        for(int i = 0;i < n; i++){
            times.add(sc.nextInt());
        }
        if(n%2==1) System.out.println("still running");
        else {
            int sum = 0;
            for(int i = 0; i < times.size(); i+=2){
                sum += times.get(i+1) - times.get(i);
            }
            System.out.println(sum);
        }
        sc.close();
    }

}
