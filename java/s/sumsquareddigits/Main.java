import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int i = 0;i < p; i++){
            int k = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            long sum = 0;
            int index = 0;
            long maxPower = Math.round(Math.log(n)/Math.log(b));
            long currentPower = maxPower;
            while(currentPower>= 0){               
                long r = n / (long) Math.pow(b, currentPower);
                n -= r * (long) Math.pow(b, currentPower);
                sum += r*r;
                currentPower--;
            }
            System.out.println(i+1 + " " + sum);
        }

        sc.close();
    }

}
