import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long count = sc.nextLong();
        int index = 0;
        List<String> inputs = new ArrayList<>();
        while (index < count){
            inputs.add(sc.next());
            index++;
        }
        sc.close();

        for(String input: inputs){
            System.out.println("Takk " + input);
        }
    }
}
