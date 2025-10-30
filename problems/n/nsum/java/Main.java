import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<i1; i++){
            sum += sc.nextInt();
        }
        sc.close();
        System.out.println(sum);
    }
}
