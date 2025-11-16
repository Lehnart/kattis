import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if(n == -1) break;

            int[][] matrix = new int[n][n];
            for(int i = 0; i < n ; i++){
                for(int j = 0; j < n ; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            Set<Integer> strongVertices = new HashSet<>();
            List<Integer> weakVertices = new ArrayList<>();
            for(int i = 0; i < n ; i++){
                if(strongVertices.contains(i)){
                    continue;
                }
                boolean isStrongVertex = false;
                for(int j = 0; j < n ; j++){
                    if(i == j) continue;
                    for(int k = 0; k < n; k++){
                        if(k==j || k == i ) continue;
                        if (matrix[i][j] == 1 && matrix[i][k] == 1 && matrix[j][k] == 1){
                            strongVertices.addAll(Set.of(i,j,k));
                            isStrongVertex = true;
                        }
                    }
                }
                if(!isStrongVertex) weakVertices.add(i);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < weakVertices.size(); i++) {
                if (i > 0) sb.append(' ');
                sb.append(weakVertices.get(i));
            }
            System.out.println(sb.toString());
        }
    }
}