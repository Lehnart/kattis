import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float d = sc.nextFloat();
        float w = sc.nextFloat();
        int n = sc.nextInt();
        sc.close();
        if(n*w > d*Math.PI) System.out.println("NO");
        else System.out.println("YES");
    }
}
