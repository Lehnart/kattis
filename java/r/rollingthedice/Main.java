import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String dice = s.split("\\+")[0];
        String modif = s.split("\\+")[1];
        int diceCount = Integer.parseInt(dice.split("d")[0]);
        int diceFace = Integer.parseInt(dice.split("d")[1]);
        float diceMean = (1+diceFace) / 2.f;
        System.out.println( (diceMean*diceCount) + Integer.parseInt(modif));
    }

}
