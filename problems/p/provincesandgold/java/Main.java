import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int s = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int sum = (g*3) + (s*2) + (c);
        boolean isBuying = true;
        if (sum>= 8) System.out.print("Province");
        else if (sum>= 5) System.out.print("Duchy");
        else if (sum>= 2) System.out.print("Estate");
        else isBuying = false;
        
        if(isBuying) System.out.print(" or ");

        if (sum>= 6) System.out.print("Gold");
        else if (sum>= 3) System.out.print("Silver");
        else if (sum>= 0) System.out.print("Copper");
        System.out.println();
    }
}
