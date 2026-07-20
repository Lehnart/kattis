import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        sc.close();
        int countb = 0;
        int countk = 0;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i)=='k'){
                countk++;
            }
            if(data.charAt(i)=='b'){
                countb++;
            }
        }
        
        if(countb>countk) System.out.println("boba");
        if(countb<countk) System.out.println("kiki");
        if(countb==countk && countb != 0) System.out.println("boki");
        if(countb==0 && countk == 0 ) System.out.println("none");
    }
}
