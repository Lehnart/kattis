import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for(int i = 0;i < p; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int s1 = 0;
            int s2 = 0;
            int s3 = 0;
            for(int j = 1 ; j <= n*2; j++){
                if(j <=n ) s1 += j;
                if(j%2==1)s2 += j;
                if(j%2==0)s3 += j;
            }
            System.out.println(k + " " + s1 + " " + s2 + " " + s3);
        }
        sc.close();
    }

}
