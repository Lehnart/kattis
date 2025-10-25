import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();
        sc.close();
        for(int i = 0 ; i < year; i++){
            System.out.println("Hipp hipp hurra, " + name +"!");
        }
    }
}
