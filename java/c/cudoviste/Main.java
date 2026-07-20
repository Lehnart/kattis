import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        Character [][] cs = new Character[r][c];
        for(int i = 0; i<r;i++){
            String row = sc.nextLine();
            for(int j = 0; j < c; j++){
                cs[i][j] = row.charAt(j);
            }
        }
        int[] results = new int[5];

        for(int i = 0; i<r-1;i++){
            for(int j = 0; j < c-1; j++){
                int hCount = 0;
                int xCount = 0;
                int dCount = 0;
                for(int x = 0; x <2; x++){
                    for(int y = 0; y < 2;y++){
                        switch (cs[i+x][j+y]) {
                            case '#':
                                hCount++;
                                break;
                            case '.':
                                dCount++;
                                break;
                            case 'X':
                                xCount++;
                                break;
                        }
                    }
                }
                if(hCount==0){
                    results[xCount]++;
                }
            }
        }
        for(int i = 0 ; i < 5 ;i++){
            System.out.println(results[i]);
        }
    }
}
