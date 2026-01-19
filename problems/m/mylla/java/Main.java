import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int aGame = 0;
        int hGame = 0;
        int aRound =0;
        int hRound =0;
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'A'){
                aGame++;
            } else {
                hGame++;
            }
            if (aGame == 3) {
                aRound++;
                aGame =0;
                hGame =0;
            } else if (hGame ==3) {
                hRound++;
                aGame =0;
                hGame =0;
            }

        }

        if(aRound > hRound){
            System.out.println("Hannes");
        } else {
            System.out.println("Arnar");
        }
    }
}
