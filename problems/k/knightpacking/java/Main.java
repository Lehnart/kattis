import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        if(i%2 == 1) System.out.println("first");
        else System.out.println("second");
    }
}
