import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i < n; i++){
            String input = sc.next().strip();
            if(input.contains("+")){
                String[] ints = input.split("\\+");
                System.out.println( Integer.parseInt(ints[0]) + Integer.parseInt(ints[1]) ); 
            }
            else{
                System.out.println("skipped");
            }
        }
        sc.close();
        
    }
}
