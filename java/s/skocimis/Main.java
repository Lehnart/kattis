import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static record State(int a, int b, int c){
        int getLeft(){
            return Math.min(a, Math.min(b,c));
        } 
        
        int getMid(){
            if(a<b && a>c) return a; 
            if(a<c && a>b) return a; 
            if(b<a && b>c) return b; 
            if(b<c && b>a) return b; 
            return c;
        }

        int getRight(){
            return Math.max(a, Math.max(b,c));
        } 

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        State state = new State(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(Math.max(state.getRight()-state.getMid(), state.getMid()-state.getLeft())-1);
    }
}
