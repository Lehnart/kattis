import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int event = sc.nextInt();
        int count = 0;
        int rejected = 0;
        for(int i = 0 ; i < event; i++){
            String e = sc.next();
            int size = sc.nextInt();
            if(e.equals("enter")){
                if(count + size <= limit){
                    count+= size;
                }
                else{
                    rejected++;
                }
            }
            else{
                count -= size;
            }
        }
        sc.close();
        System.out.println(rejected);
        
    }
}
