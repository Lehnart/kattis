import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long input = sc.nextLong();
        sc.close();
        while(true){
            long sum = sumOfDigits(input);
            if(input % sum ==0){
                System.out.println(input);
                break;
            }
            else{
                input ++;
            }
        }
    }

    public static long sumOfDigits(Long input){
        String inputString = input.toString();
        long sum = 0;
        for(int i = 0; i < inputString.length(); i++){
            String c = inputString.substring(i, i+1);
            sum += Long.parseLong(c);
        }
        return sum;
    }
}
