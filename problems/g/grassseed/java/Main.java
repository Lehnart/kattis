import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        double c = sc.nextDouble();
        int l = sc.nextInt();
        
        double sum = 0;
        for(int i = 0; i < l; i++){
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            sum += c*w*h;
        }
        sc.close();
        System.out.println(sum);
    }
}
