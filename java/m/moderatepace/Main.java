import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> dailyDistances = new ArrayList<>();
        List<Long> colleagueDailyDistances = new ArrayList<>();
        List<Long> otherColleagueDailyDistances = new ArrayList<>();
        List<Long> idealDailyDistances = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            dailyDistances.add(sc.nextLong());
        }
        for(int i = 0; i < n ; i++){
            colleagueDailyDistances.add(sc.nextLong());
        }
        for(int i = 0; i < n ; i++){
            otherColleagueDailyDistances.add(sc.nextLong());
        }
        sc.close();

        for(int i = 0; i < n ; i++){
            long d1 = dailyDistances.get(i);
            long d2 = colleagueDailyDistances.get(i);
            long d3 = otherColleagueDailyDistances.get(i);
            List<Long> list = new ArrayList<>(List.of(d1, d2, d3));
            list.sort(Comparator.naturalOrder());
            idealDailyDistances.add(list.get(1));
        }
        boolean isFirst = true;
        for(Long d : idealDailyDistances){
            if(!isFirst) System.out.print(" ");
            System.out.print(d);
            isFirst = false;
        }
        System.out.println();
    }
}
