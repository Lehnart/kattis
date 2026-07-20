import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            int b = sc.nextInt();
            float p = sc.nextFloat();
            System.out.println(60*(b-1)/p);
            System.out.println(60*b/p);
            System.out.println(60*(b+1)/p);
        }
    }
}
