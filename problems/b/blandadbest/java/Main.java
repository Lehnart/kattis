import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        List<String> ingredients = new ArrayList<>();
        for(int i = 0; i < i1; i++){
            ingredients.add(sc.next());
        }
        sc.close();
        boolean isNautakjotIn = ingredients.contains("nautakjot");
        boolean isKjuklingur = ingredients.contains("kjuklingur");
        if(isNautakjotIn && !isKjuklingur){
            System.out.println("nautakjot");
        }
        else if(!isNautakjotIn && isKjuklingur){
            System.out.println("kjuklingur");
        }
        else {
            System.out.println("blandad best");
        }
    }
}
