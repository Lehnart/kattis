import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Long[] inputs = new Long[3];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> mondays = new ArrayList<>();
        List<Integer> tuesdays = new ArrayList<>();
        for(int i =0; i < n; i++){
            mondays.add(sc.nextInt());
        }
        for(int i =0; i < m; i++){
            tuesdays.add(sc.nextInt());
        }
        boolean isFirst = true;
        for(int i =0; i < n; i++){
            if(tuesdays.contains(mondays.get(i))){
                if(!isFirst) System.out.print(" ");
                System.out.print(mondays.get(i));
                isFirst=false;
            }
        }
        System.out.print("\n");
        sc.close();
    }
}
