import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        int r = Integer.parseInt(new StringBuilder(Integer.toBinaryString(i)).reverse().toString(), 2);
        System.out.println(r);
    }

}
