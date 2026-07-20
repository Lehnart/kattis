import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        sc.close();
        System.out.print("h");
        int eCount = (c.length()-2)*2;
        for (int i = 0 ; i < eCount ; i++){
            System.out.print("e");   
        }
        System.out.println("y");
    }
}
