import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        a ++;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <= a ; i++){
            if(i==0 || i == a) sb.append("+");
            else sb.append("|");
            for(int j = 1 ; j < a ; j++){
                if(i==0 || i == a) sb.append("-");
                else sb.append(" ");
            }
            if(i==0 || i == a) sb.append("+");
            else  sb.append("|");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
