import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Qaly(float q, float y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        int count = sc.nextInt();
        List<Qaly> qalys = new ArrayList<>();
        for (int i = 0; i < count; i++){
            float q = sc.nextFloat();
            float y = sc.nextFloat();
            qalys.add(new Qaly(q, y));
        }
        sc.close();
        float sum = 0.f;
        for(Qaly qaly:qalys){
            sum += qaly.q*qaly.y;
        }
        System.out.println(sum);
    }
}
