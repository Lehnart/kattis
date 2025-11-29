import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        String binary = Integer.toBinaryString(c);
        System.out.println(binary.chars().filter(ca -> ca == '1').count());
    }
}
