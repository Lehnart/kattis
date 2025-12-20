import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int[] rooms = new int[n];
        for(int i = 0; i < m; i++){
            rooms[i%n]++;
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < rooms[i]; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
