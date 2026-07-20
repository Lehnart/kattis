import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int sum = 0;
        for( String pbs : s.split(";")){
            if(!pbs.contains("-")) sum += 1;
            else{
                String[] pbsSplitted = pbs.split("-");
                sum += Integer.parseInt(pbsSplitted[1]) - Integer.parseInt(pbsSplitted[0]) + 1;
            }
        }
        System.out.println(sum);
    }
}
