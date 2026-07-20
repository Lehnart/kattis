import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> takens = new HashSet<>();
        for(int i = 0; i< n; i++){
            int m = sc.nextInt();
            List<String> choices = new ArrayList<>();
            for(int j = 0; j < m; j++){
                choices.add(sc.next());
            }
            for(int j=0; j <m; j++){
                String app = choices.get(j);
                if (!takens.contains(app)){
                    takens.add(app);
                    System.out.print(app + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}
