import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isDone = false;
        for(int i = 0; i < n; i++){
            if (isDone) break;
            int k = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            boolean hasPeaSoup = false;
            boolean hasPancake = false;
            for(int j = 0; j < k; j++){
                String dish = sc.nextLine().strip();
                if(dish.equals("pea soup")) hasPeaSoup = true;
                if(dish.equals("pancakes")) hasPancake = true;
            }
            if(hasPancake && hasPeaSoup) {
                System.out.println(name);
                isDone = true;
            }
        }
        sc.close();
        if(!isDone) System.out.println("Anywhere is fine I guess");
    }
}
