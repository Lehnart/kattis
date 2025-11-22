import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        BitSet bits = new BitSet(n);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') bits.set(i);
        }
        sc.close();
        System.out.println(bits.get(0) ? "1" : "0");
    }
}
