import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != -1){
            int ph = 0;
            int d = 0;
            for(int i = 0; i < n; i++){
                int v = sc.nextInt();
                int h = sc.nextInt();
                d += v * (h-ph);
                ph = h;
            }
            System.out.println(d +" miles");
            n = sc.nextInt();
        }
        sc.close();
    }

}
