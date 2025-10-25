import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long windowCount = sc.nextLong();
        Long curtainCount = sc.nextLong();
        sc.close();

        System.out.println(windowCount - curtainCount);
    }
}
