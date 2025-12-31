import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        sc.close();
        int i = 1;
        int sum = 0;
        while(true){
            long d = i*(i+1)*(i+2);
            i++;
            if(d < n) sum++;
            else break;
        }
        System.out.println(sum);
    }
}
