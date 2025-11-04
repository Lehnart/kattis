import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String d = sc.next();
        sc.close();
        if(m.equals("OCT") && d.equals("31")) System.out.println("yup");
        else if(m.equals("DEC") && d.equals("25")) System.out.println("yup");
        else System.out.println("nope");
    }
}
