import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] ps = new int[h][w];
        for(int j = 0; j < h; j++){
            for(int i = 0; i < w; i++){
                ps[j][i] = sc.nextInt();
            }
        } 

        boolean hasLowPressure = false;
        for(int j = 1; j < h-1; j++){
            for(int i = 1; i < w-1; i++){
                if ( ps[j][i] < ps[j][i-1]  && ps[j][i] < ps[j-1][i]  && ps[j][i] < ps[j][i+1]  && ps[j][i] < ps[j+1][i] ){
                    System.out.println("Jebb");
                    hasLowPressure = true;
                } 
                if(hasLowPressure) break;
            }
            if(hasLowPressure) break;
        } 
        
        sc.close();
        if(!hasLowPressure) System.out.println("Neibb");
    }
}
