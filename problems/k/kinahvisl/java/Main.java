import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String out = sc.next();
        sc.close();
        int s = 1;
        for(int i = 0 ; i < in.length(); i++){
            if(in.charAt(i) != out.charAt(i)){
                s++;
            }
        }
        System.out.println(s);
    }
}
