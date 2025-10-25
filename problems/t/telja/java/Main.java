import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Long[] inputs = new Long[1];
        Scanner sc = new Scanner(System.in);

        int currentIndex = 0;
        while (sc.hasNextLong()) {
            long data = sc.nextLong();
            inputs[currentIndex] = data;
            currentIndex++;
        }
        sc.close();

        Long a = inputs[0];
        for(long i = 1; i <= a; i++ ) {
            System.out.println(i);
        }
    }
}
