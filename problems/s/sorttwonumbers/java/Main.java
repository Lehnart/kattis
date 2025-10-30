import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long d = sc.nextLong();
        long e = sc.nextLong();
        sc.close();
        if(d<e){
            System.out.println(d + " " + e); 
        }
        else{
            System.out.println(e + " " + d); 
        }
    }
}
