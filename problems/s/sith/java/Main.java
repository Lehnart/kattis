import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aMinusB = sc.nextInt();
        
        if(aMinusB < 0) System.out.println("JEDI");
        else if(a-b<0 && aMinusB>0) System.out.println("SITH");
        else System.out.println("VEIT EKKI");

        sc.close();
    }

}
