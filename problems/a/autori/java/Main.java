import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        String r = "";
        for(String s : a.split("-")){
            r += s.toUpperCase().charAt(0);
        }
        System.out.println(r);
    }
}
