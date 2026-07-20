import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        if(input.contains("COV")){
            System.out.println("Veikur!");
        }
        else{
            System.out.println("Ekki veikur!");
        }
    }
}
