import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int wind = sc.nextInt();
        int roadCount = sc.nextInt();
        while(sc.hasNext()){
            String road = sc.next();
            int maxWind = sc.nextInt();
            if(wind > maxWind) System.out.println(road + " lokud");
            else System.out.println(road + " opin");
        }
        sc.close();
    }
}
