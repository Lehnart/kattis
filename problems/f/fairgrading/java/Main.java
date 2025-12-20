import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        double g = (a*0.25) + (b*0.25) + (c*0.5);
        if(g>=90.) System.out.println("A");
        else if(g>=80.) System.out.println("B");
        else if(g>=70.) System.out.println("C");
        else if(g>=60.) System.out.println("D");
        else System.out.println("F");
    }

}
