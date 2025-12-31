import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static record Point(Long x, Long y){}

    public static void main(String[] args){

    
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        List<Point> ps = new ArrayList<>();
        for(int i = 0; i < k ; i++){
            ps.add(new Point(sc.nextLong(), sc.nextLong()));
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        
        for(long i = 0; i < n; i++){
            for(long j = 0; j < m; j++){
                sb.append(".");
            }
            sb.append("\n");
        }
        for(Point p : ps){
            sb.setCharAt( (int) ((p.y-1) + ((m+1)*(p.x-1))), '*');
        }
        System.out.print(sb);
    }
}
