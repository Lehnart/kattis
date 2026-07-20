import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r1 = sc.nextLine();
        String r2 = sc.nextLine();
        String r3 = sc.nextLine();
        sc.close();
        Character[][] g = new Character[3][3];
        g[0][0] = r1.charAt(0); 
        g[0][1] = r1.charAt(1); 
        g[0][2] = r1.charAt(2); 
        g[1][0] = r2.charAt(0); 
        g[1][1] = r2.charAt(1); 
        g[1][2] = r2.charAt(2); 
        g[2][0] = r3.charAt(0); 
        g[2][1] = r3.charAt(1); 
        g[2][2] = r3.charAt(2); 

        boolean hasWin = false;
        for(int i = 0 ; i < 3; i++){
            if(g[i][0] == g[i][1] && g[i][1] == g[i][2] && g[i][0] == 'O') hasWin = true;
            if(g[0][i] == g[1][i] && g[1][i] == g[2][i] && g[0][i] == 'O') hasWin = true;
        }
        if(g[0][0] == g[1][1] && g[1][1] == g[2][2] && g[0][0] == 'O') hasWin = true;
        if(g[0][2] == g[1][1] && g[1][1] == g[2][0] && g[0][2] == 'O') hasWin = true;

        System.out.println( hasWin ? "Jebb" : "Neibb");
    }
}
