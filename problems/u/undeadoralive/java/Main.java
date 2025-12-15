import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        String s = sc.nextLine();
        sc.close();
        if(s.contains(":)") && s.contains(":(")) System.out.println("double agent");
        else if(s.contains(":)")) System.out.println("alive");
        else if(s.contains(":(")) System.out.println("undead");
        else System.out.println("machine");
    }
}
