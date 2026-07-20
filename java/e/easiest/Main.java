import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int countDigitSum(int n){
        int sum = 0;    
        int temp = n;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int nSum = countDigitSum(n);
            int p = 11;
            while( nSum != countDigitSum(p*n) ){
                p++;
            }
            System.out.println(p);
            n = sc.nextInt();
        }
    }
}
