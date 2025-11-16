import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < c; i++){
            String s = sc.nextLine();
            if(s.startsWith("Simon says")){
                System.out.println(s.substring(10));
            }
        }
        sc.close();
    }
}
