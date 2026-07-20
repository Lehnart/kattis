import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        boolean isFirst = true;
        while(sc.hasNext()){
            String a = sc.next();
            if(a.contains("FBI"))
                if(isFirst){
                    System.out.print(i);
                    isFirst=false;
                } 
                else{
                    System.out.print(" " + i);
                }
            i++;
        }
        sc.close();
        if(isFirst){
            System.out.println("HE GOT AWAY!");
        }
        else System.out.print("\n");
    }
}
