import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = "";
        while(sc.hasNextLine()){
            s+=sc.nextLine();
        }
        sc.close();
        
        int countFilledCell = 0;
        int countEmptyCell = 0;
        for(int i =0; i< s.length();i++){
            if(s.charAt(i) == '.') countEmptyCell++;
            if(s.charAt(i) == '#') countFilledCell++;
        }
        System.out.println((float) countEmptyCell/ (float) (countEmptyCell + countFilledCell));
    }
}
