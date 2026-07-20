import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();

        for(int i = 0; i< testCaseCount; i++){
            int n = sc.nextInt();
            long factorial = 1;
            for(int j = 2; j <= n; j++){
                factorial *= j;
            }
            System.out.println(factorial % 10);
        }
        sc.close();
    }
}
