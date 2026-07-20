import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxSum = 0;
        int maxIndex = 0;
        for(int i = 0; i < 5; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += sc.nextInt();
            }
            if(sum > maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1 + " " + maxSum);
    }
}
