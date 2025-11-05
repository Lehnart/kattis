import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aAlcohol = 0;
        int bAlcohol = 0;
        for(int i = 0 ; i < a; i++ ){
            aAlcohol += sc.nextInt()*sc.nextInt();
        }
        for(int i = 0 ; i < b; i++ ){
            bAlcohol += sc.nextInt()*sc.nextInt();
        }
        if(aAlcohol == bAlcohol) System.out.println("same");
        else System.out.println("different");
    }
}
