import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sumM = 0;
        int sumN = 0;
        for(int i=0 ;i < n; i++){
            sumN += sc.nextInt();
        }
        for(int i=0 ;i < m; i++){
            sumM += sc.nextInt();
        }
        if(sumN>sumM){System.out.println("Button 1");}
        else if(sumN<sumM){System.out.println("Button 2");}
        else { System.out.println("Oh no");}
    }
}