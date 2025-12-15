import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            long l = sc.nextLong();
            boolean isOdd = ( l % 2 == 1 );
            boolean isPerfectSquare = Math.sqrt(l) == Math.floor(Math.sqrt(l));
            if(isOdd && isPerfectSquare) System.out.println("OS");
            else if(isOdd) System.out.println("O");
            else if(isPerfectSquare) System.out.println("S");
            else System.out.println("EMPTY");
        }
        sc.close();
    }
}