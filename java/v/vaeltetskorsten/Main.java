import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int max = 0;
        for(int i = 0 ; i < c ; i++){
            int a = sc.nextInt();
            String s = sc.next();
            if (s.equals("nej") && a > max ){
                max = a;
            }
        }
        sc.close();
        System.out.println(max);
    }
}
