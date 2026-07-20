import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().strip();
        sc.close();
        Character p = null;
        for(int i = 0 ; i < s.length(); i++){
            if(p == null) {
                System.out.print(s.charAt(i));
                p = s.charAt(i);
            }
            if(s.charAt(i) == p) {
                continue;
            } 
            p = s.charAt(i);
            System.out.print(s.charAt(i));
        }
        System.out.print("\n");
    }

}
