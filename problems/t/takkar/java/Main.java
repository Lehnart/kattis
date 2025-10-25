import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Long[] inputs = new Long[2];
        Scanner sc = new Scanner(System.in);

        int currentIndex = 0;
        while (sc.hasNextLong()) {
            long data = sc.nextLong();
            inputs[currentIndex] = data;
            currentIndex++;
        }
        sc.close();

        Long a = inputs[0];
        Long b = inputs[1];
        if(a<b){
            System.out.println("FAKE NEWS!");
        }
        else if (a>b){
            System.out.println("MAGA!");
        }
        else{
            System.out.println("WORLD WAR 3!");
        }
    }
}
