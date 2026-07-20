import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        while(true){
            double r = sc.nextDouble();
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m==0 && c==0) break;
            System.out.println( (Math.PI*r*r) + " " + 4*r*r*c/m);
        }
        sc.close();
    }
}
