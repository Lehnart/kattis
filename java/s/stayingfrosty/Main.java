import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        if(w <= 360*p) System.out.println("YES");
        else System.out.println("NO");
    }

}
