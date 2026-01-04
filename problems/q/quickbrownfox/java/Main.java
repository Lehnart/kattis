import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String az = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < n; i++){
            String s = sc.nextLine().toLowerCase();
            String missing = "";
            for(int j = 0; j < 26; j++){
                Character c = az.charAt(j);
                if(s.indexOf(c) == -1 ) missing+= c;
            }
            if(!missing.equals("")){
                System.out.println("missing "+missing);
            }
            else{
                System.out.println("pangram");
            }
        }      
    }
}
