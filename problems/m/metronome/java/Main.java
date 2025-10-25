import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long data = sc.nextLong();
        sc.close();

        double f = data / 4.0;
        System.out.printf(java.util.Locale.US, "%.2f\n", f);
    }
}
