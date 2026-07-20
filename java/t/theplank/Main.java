import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int a = sc.nextInt();
        sc.close();
        System.out.println(f(a));
    }

    public static int f(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;
        return f(n-1) + f(n-2) + f(n-3);
    }
}
