import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Map<String, List<String>> dateToNames = new HashMap<>();
        Map<String, Integer> nameToLove = new HashMap<>();
        List<String> birthdays = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            String name = strings[0];
            int love = Integer.parseInt(strings[1]);
            String date = strings[2];
            if(!dateToNames.containsKey(date)){
                dateToNames.put(date, new ArrayList<>());
            }
            dateToNames.get(date).add(name);
            nameToLove.put(name, love);
        }
        sc.close();

        for(String date: dateToNames.keySet()){
            List<String> names = dateToNames.get(date);
            if(names.size() == 1) birthdays.add(names.get(0));
            else{
                int maxLove = 0;
                String maxName = "";
                for(String name : names){
                    int love = nameToLove.get(name);
                    if(love > maxLove){
                        maxLove = love;
                        maxName = name;
                    }
                }
                birthdays.add(maxName);
            }
        }

        birthdays.sort(String::compareTo);
        System.out.println(birthdays.size());
        for(String name:birthdays){
            System.out.println(name);
        }
    }

}
