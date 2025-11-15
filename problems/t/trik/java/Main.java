import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        int c = 0;
        int t = 0;
        Scanner sc = new Scanner(System.in);      
        String s = sc.nextLine().strip();
        sc.close();
        for(int i =0; i < s.length(); i++){
            char car = s.charAt(i);
            if(car == 'A'){
                t = a;
                a = b;
                b = t;
            }
            
            if(car == 'B'){
                t = b;
                b = c;
                c = t;
            }

            if(car == 'C'){
                t = c;
                c = a;
                a = t;
            }
        }
        if(a == 1) System.out.println("1");
        if(b == 1) System.out.println("2");
        if(c == 1) System.out.println("3");
    }
}
