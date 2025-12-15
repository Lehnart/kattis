import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        sc.close();
        int seconds = s % 60;
        int minutes = (s / 60) % 60;
        int hours = (s / 3600);
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }

}
