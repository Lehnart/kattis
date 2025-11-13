import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int small = 0;
        int medium = 0;
        int large = 0; 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            String s = sc.next().strip();
            if ( s.equals("S") ) small += sc.nextInt();
            if ( s.equals("M") ) medium += sc.nextInt();
            if ( s.equals("L") ) large += sc.nextInt();
        }
        sc.close();
        System.out.println( Math.ceilDiv(small,6) + Math.ceilDiv(medium,8) + Math.ceilDiv(large, 12) );
    }
}
