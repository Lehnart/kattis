import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        sc.close();
        String firstHalf = message.substring(0, message.length()/2);
        String secondHalf = message.substring(message.length()/2);
        int firstRotation = firstHalf.chars().map( c -> c - 'A').sum();
        int secondRotation = secondHalf.chars().map( c -> c - 'A').sum();
        String firstRotated = firstHalf.chars().map(c -> (((c-'A') + firstRotation) % 26 ) + 'A' ).collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append).toString();
        String secondRotated = secondHalf.chars().map(c -> (((c-'A') + secondRotation) % 26 ) + 'A' ).collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append).toString();
        String result = "";
        for(int i = 0; i<firstRotated.length(); i++){
            Character c = (char) ((firstRotated.charAt(i) - 'A' + secondRotated.charAt(i) - 'A') % 26 + 'A'); 
            result += c;
        }
        
        System.out.println(result);
    }
}
