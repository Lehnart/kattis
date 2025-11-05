import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int i=0; i<c; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for(int j = 0 ; j<= b; j++){
                sum += j + 1;
            }
            System.out.println(a + " " + (sum-1));
        }
        sc.close();
    }
}
