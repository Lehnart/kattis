import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Map<Character, Character> map = new HashMap<>();
        map.put('a', 'q');
        map.put('b', 'w');
        map.put('c', 'e');
        map.put('d', 'r');
        map.put('e', 't');
        map.put('f', 'y');
        map.put('g', 'u');
        map.put('h', 'i');
        map.put('i', 'o');
        map.put('j', 'p');
        map.put('k', 'a');
        map.put('l', 's');
        map.put('m', 'd');
        map.put('n', 'f');
        map.put('o', 'g');
        map.put('p', 'h');
        map.put('q', 'j');
        map.put('r', 'k');
        map.put('s', 'l');
        map.put('t', 'z');
        map.put('u', 'x');
        map.put('v', 'c');
        map.put('w', 'v');
        map.put('x', 'b');
        map.put('y', 'n');
        map.put('z', 'm');

        Scanner sc = new Scanner(System.in);      
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (map.containsKey(c)) System.out.print(map.get(c));
            else System.out.print(c);
        }
        System.out.print("\n");
    }
}
