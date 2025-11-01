import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if(a>90 || b>90 || c>90){
            System.out.println("Trubbig Triangel");
        }
        else if (a<90 && b<90 && c<90){
            System.out.println("Spetsig Triangel");
        }
        else{
            System.out.println("Ratvinklig Triangel");
        }
    }
}
