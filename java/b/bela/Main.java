import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt()*4;
        String d = sc.next().strip();
        int sum = 0;
        for (int i = 0 ; i < c; i++){
            String card = sc.next().strip();
            String c1 = card.substring(0,1);
            String d1 = card.substring(1);
            if (d1.equals(d)){
                if (c1.equals("A")) sum += 11;
                else if (c1.equals("K")) sum += 4;
                else if (c1.equals("Q")) sum += 3;
                else if (c1.equals("J")) sum += 20;
                else if (c1.equals("T")) sum += 10;
                else if (c1.equals("9")) sum += 14;
                else if (c1.equals("8")) sum += 0;
                else if (c1.equals("7")) sum += 0;
            }
            else{
                if (c1.equals("A")) sum += 11;
                else if (c1.equals("K")) sum += 4;
                else if (c1.equals("Q")) sum += 3;
                else if (c1.equals("J")) sum += 2;
                else if (c1.equals("T")) sum += 10;
                else if (c1.equals("9")) sum += 0;
                else if (c1.equals("8")) sum += 0;
                else if (c1.equals("7")) sum += 0;
            }
        }
        sc.close();
        System.out.println(sum);
    }
}