import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();        
        int volume = 7;
        for(int i = 0; i < n ; i++){
            s = sc.nextLine();
            if(s.contains("op") && volume < 10) volume ++;
            if(s.contains("ned") && volume > 0) volume --;
        }
        sc.close();
        System.out.println(volume);
    }

}
