import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        sc.useLocale(java.util.Locale.US);
        int n = sc.nextInt();
        List <Long> xs = new ArrayList<>();
        List <Double> ys = new ArrayList<>();
        for(int i =0; i < n; i++){
            xs.add(sc.nextLong());
            ys.add(sc.nextDouble());
        }
        sc.close();
        double sum = 0.;
        for(int i =0; i< xs.size()-1; i++){
            Long x0 = xs.get(i);
            Long x1 = xs.get(i+1);
            double y0 = ys.get(i);
            double y1 = ys.get(i+1);
            sum += (y0+y1)/2.*(x1-x0);
        }
        System.out.println(sum/1000.);
    }
}
