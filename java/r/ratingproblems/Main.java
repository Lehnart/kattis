import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += sc.nextInt();
        }       
        sc.close();
        float maxSum = sum;
        float minSum = sum;
        for(int i = 0 ; i < (n-k); i++){
            maxSum += 3;
            minSum += -3;
        }
        System.out.println(minSum/n + " " + maxSum/n);
    }

}
