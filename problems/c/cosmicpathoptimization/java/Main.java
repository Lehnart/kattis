import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int sum = 0;
        while(sc.hasNextInt()){
            sum += sc.nextInt();
        }
        sc.close();
        System.out.println(sum/c);
    }
}
