import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for(int j = 0 ; j < c; j++){
            int i = sc.nextInt();
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd" ) );
        }
        sc.close();        
    }
}
