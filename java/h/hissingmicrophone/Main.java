import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
        if(input.contains("ss")){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}
