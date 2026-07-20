import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = "";
        if(sc.hasNext()) a = sc.next();
        sc.close();
        if(a.length() > 2){
            System.out.println(new StringBuilder(a.substring(1)).reverse().toString());
        }
        else{
            System.out.println("aaa");
        }
    }
}
