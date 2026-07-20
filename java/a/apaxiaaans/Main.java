import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        char previous = ' ';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != previous){
                previous = a.charAt(i);
                sb.append(previous);
            }
        }
        System.out.println(sb.toString());
    }
}
