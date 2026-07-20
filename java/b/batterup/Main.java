import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        float sum = 0;
        int count = 0;
        while(sc.hasNextInt()){
            
            int j = sc.nextInt();
            if (j >= 0){
                sum +=j;
                count ++;
            } 
        }
        sc.close();
        System.out.println( sum / count );        
    }
}
