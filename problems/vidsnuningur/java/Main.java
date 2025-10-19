import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = "";
        while (sc.hasNext()) {
            data = sc.next();
        }
        sc.close();
        System.out.println(new StringBuilder(data).reverse().toString());
    }
}
