import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c = sc.next();
        int count = 0;
        sc.close();
        
        String n = new String(s);
        while (!n.toString().equals(c)){
            StringBuilder nn = new StringBuilder();
            char current = 0;
            int charCount = 0;
            count++;
            for(int i = 0 ; i < n.length(); i++){
                char ch = n.charAt(i);
                if (ch != current){
                    if(current != 0){
                        nn.append(charCount);
                        nn.append(String.valueOf(current));
                    }
                    current = ch;
                    charCount = 1;
                    
                }
                else{
                    charCount++;
                }
            }
            nn.append(charCount);
            nn.append(String.valueOf(current));
            n = nn.toString();
        }
        System.out.println(count);
    }
}
