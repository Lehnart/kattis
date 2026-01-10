import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int p = 0;
            int notBorn = 0;
            while(n != 0){
                if( n != 1 && n > p*2 ){
                    notBorn += n - (p*2);
                }
                p = n;
                n = sc.nextInt();
            }
            System.out.println(notBorn);
        }
        sc.close();

    }
}