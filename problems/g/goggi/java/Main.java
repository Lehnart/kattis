import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();
        sc.close();
        if(a<c){
            System.out.println("<");
        }
        else if(a>c){
            System.out.println(">");
        }
        else{
            System.out.println("Goggi svangur!");
        }
    }
}
