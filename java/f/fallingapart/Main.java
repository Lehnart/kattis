import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i < n; i ++){
            numbers.add(sc.nextInt());
        }    

        sc.close();

        numbers.sort(Comparator.reverseOrder());
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        boolean turnAlice = true;
        while(!numbers.isEmpty()){
            if(turnAlice){
                alice.add(numbers.remove(0));
            } else {
                bob.add(numbers.remove(0));
            }
            turnAlice = !turnAlice;
        }   
        System.out.print(alice.stream().mapToInt(Integer::intValue).sum()); 
        System.out.print(" ");
        System.out.println(bob.stream().mapToInt(Integer::intValue).sum()); 
    }
}
