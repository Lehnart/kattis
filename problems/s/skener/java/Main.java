import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder lineBuilder = new StringBuilder();
        for(int i = 0; i < r; i++){
            String line = sc.nextLine().strip();
            for(int j =0; j < c; j++){
                for(int k = 0 ; k < zc; k++) lineBuilder.append(line.charAt(j));
            }
            for(int l = 0; l < zr; l++) sb.append(lineBuilder.toString() + "\n");
            lineBuilder = new StringBuilder();
        }
        System.out.print(sb.toString());
    }
}
