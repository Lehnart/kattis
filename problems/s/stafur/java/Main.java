import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> vowels = Set.of("A", "E", "I", "O", "U");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if (s.toUpperCase().equals("Y")) System.out.println("Kannski");
        else if (vowels.contains(s.toUpperCase()))  System.out.println("Jebb");
        else System.out.println("Neibb");

    }

}
