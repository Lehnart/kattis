import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer p = sc.nextInt();
        sc.close();
        while(p >= 10){
            int next = 1;
            for(int i = 0; i < p.toString().length(); i++){
                char c = p.toString().charAt(i);
                if(c > '0' && c <= '9'){
                    int digit = c - '0';
                    next *= digit;
                }
            }
            p = next;
        }
        System.out.println(p);
    }

}
