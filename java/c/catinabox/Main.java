import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int v = h*l*w;
        if(v == c)System.out.println("COZY");
        else if(v > c)System.out.println("SO MUCH SPACE");
        else System.out.println("TOO TIGHT");
        sc.close();
    }
}
