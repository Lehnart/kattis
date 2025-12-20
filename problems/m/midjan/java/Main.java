import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Pair(Character c1, Character c2){}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> mondays = new ArrayList<>();
        List<Integer> tuesdays = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) mondays.add(sc.nextInt());
        for(int i = 0 ; i < m ; i++) tuesdays.add(sc.nextInt());
        boolean isFirst = true;
        for(int monday : mondays) {
            if(!tuesdays.contains(monday)){
                if(!isFirst) System.out.print(" "); 
                System.out.print(monday);
                isFirst = false;
            } 
        }     
        System.out.print("\n");

        isFirst = true;
        for(int tuesday : tuesdays) {
            if(!mondays.contains(tuesday)){
                if(!isFirst) System.out.print(" "); 
                System.out.print(tuesday);
                isFirst = false;
            } 
        }     
        System.out.print("\n");

        sc.close();

    }
}
