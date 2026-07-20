import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 0 ; i < 12; i++){
            sum+=c;
            System.out.println(sum);
        }
    }
}
