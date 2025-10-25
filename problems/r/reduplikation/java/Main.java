import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long repetition = sc.nextLong();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i<repetition; i++){
            sb.append(str);
        }
        System.out.println(sb.toString());
    }

    public enum InputType{
        LONG,
        STRING
    }

    public static List<?> readInput(InputType type){
        Scanner sc = new Scanner(System.in);
        if(type == InputType.LONG){
            List<Long> inputs = new ArrayList<>();
            while (sc.hasNextLong()) {
                long data = sc.nextLong();
                inputs.add(data);
            }
            sc.close();
            return inputs;
        }
        if(type == InputType.STRING){
            List<String> inputs = new ArrayList<>();
            while (sc.hasNext()) {
                String data = sc.next();
                inputs.add(data);
            }
            sc.close();
            return inputs;
        }
        return new ArrayList<>();
    }
}
