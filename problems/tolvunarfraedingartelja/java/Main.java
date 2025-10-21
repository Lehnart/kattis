import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<?> inputs = readInput(InputType.LONG, 1);
        Long input = (Long) inputs.get(0);
        System.out.println(input-1);
    }

    public enum InputType{
        LONG,
        STRING
    }

    public static List<?> readInput(InputType type, Integer count){
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
