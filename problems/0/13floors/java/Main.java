import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.close();
        if (c>= 13)       System.out.println( (c + 1) );
        else              System.out.println( c );
    }
}
