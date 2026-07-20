import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        Character[] c = new Character[w];
        for(int y = 0 ; y < h ; y++){
            String s = sc.nextLine().strip();
            for(int x = 0; x < w ; x++){
                if(s.charAt(x) != '.') c[x] = s.charAt(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : c) {sb.append(ch);}
        System.out.println(sb.toString());
    }
}
