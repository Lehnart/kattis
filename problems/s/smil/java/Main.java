import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        Set<String> smiles = Set.of(":)", ";)", ":-)", ";-)");
        for(int index = 0; index < s.length(); index++){
            String ss = s.substring(index);
            for(String smile : smiles){
                if(ss.startsWith(smile)){
                    System.out.println(index);
                    break;
                }
            }    
        }
       
    }

}
