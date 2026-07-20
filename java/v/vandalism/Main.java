import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        sc.close();
        if(!data.contains("U")) System.out.print("U");
        if(!data.contains("A")) System.out.print("A");
        if(!data.contains("P")) System.out.print("P");
        if(!data.contains("C")) System.out.print("C");
        System.out.print("\n");
    }
}
