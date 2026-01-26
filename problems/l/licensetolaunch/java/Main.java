import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000000000;
        int dayMin = 0; 
        for(int i =0; i < n; i++){
            int c = sc.nextInt();
            if(min > c){
                min = c;
                dayMin = i;
            }
        } 
        sc.close();
        System.out.println(dayMin);
 
    }
}
