import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Long[] inputs = new Long[3];
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt()*5280;
        int n = sc.nextInt();
        sc.close();
        System.out.println(w/n);
    }
}
