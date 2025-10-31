import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += sc.nextInt();
        }
        sc.close();
        if(sum <= b)  System.out.println("Jebb");
        else System.out.println("Neibb");
    }
}
