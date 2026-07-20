import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int angle = sc.nextInt();
        sc.close();
        long l = (long) Math.ceil(h / Math.sin(angle*Math.PI/180.));
        System.out.println(l);
    }
}
