import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < n; i++){
            String s = sc.next();
            s = s.toLowerCase();
            if (s.contains("pink") || s.contains("rose")) count++;
        }
        sc.close();
        if(count>0) System.out.println(count);
        else System.out.println("I must watch Star Wars with my daughter");
    }

}
