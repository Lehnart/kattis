import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        long stones = sc.nextLong();
        sc.close();
        if(stones % 2==0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }

    }
}
