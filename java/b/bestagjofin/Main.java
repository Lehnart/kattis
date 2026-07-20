import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static record Gift(int price, String name){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer input = sc.nextInt();
        int index = 0;
        List<Gift> gifts = new ArrayList<>();
        while (index < input){
            String name = sc.next();
            int price = sc.nextInt();
            gifts.add(new Gift(price, name));
            index++;
        }
        sc.close();

        Gift bestGift = new Gift(0, null);
        for(Gift gift : gifts){
            if(gift.price>bestGift.price){
                bestGift = gift;
            }
        }
        System.out.println(bestGift.name);
    }
}
