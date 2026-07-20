import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public record Pair(int x, int y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Pair> rooks = new ArrayList<>();
        for(int j = 0; j < 8; j++){
            String s = sc.nextLine();
            for(int i = 0; i<8; i++){
                char r = s.charAt(i);
                if(r == 'R') rooks.add(new Pair(i, j));
            }
        }
        int count = 0;
        for(int i = 0; i <8;i++){
            for(int j = 0; j <8;j++){
                boolean isSafe = true;
                for(Pair p : rooks){
                    if(p.x==i || p.y ==j) {
                        isSafe = false;
                        break;
                    }
                }
                if(isSafe) count++;
            }
        }
        System.out.println(count);
    }

}
