import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < c; i++){
            if(sc.nextInt() % 2 == 1) sum ++;
        }
        sc.close();
        System.out.println(sum);
    }
}
