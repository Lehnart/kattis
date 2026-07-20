import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int l = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        
        int n = l; 
        while(true){
            if( computeDigitSum(n) != x ){
                n--;
            }
            else{
                break;
            }
        }
        int m = d + 1;
        while(true){
            if( computeDigitSum(m) != x ){
               m++;
            }
            else{
                break;
            }
        }
        System.out.println(m);
        System.out.println(n);
    }

    public static int computeDigitSum(int n){
        String s = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
}