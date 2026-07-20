import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        Set<Character> vowels = Set.of('a','e','i','o','u');

        int countWithoutY = 0;
        int countWithY = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(vowels.contains(s.charAt(i))){
                countWithoutY++;
                countWithY++;
            } 
            
            else if(s.charAt(i) == 'y'){
                countWithY++;
            }
        }  
        System.out.println(countWithoutY + " " + countWithY);
    }
}
