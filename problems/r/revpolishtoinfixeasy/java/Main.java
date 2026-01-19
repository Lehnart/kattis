import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] tokens = s.strip().split(" ");
        java.util.Stack<String> stack = new java.util.Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                String b = stack.pop();
                String a = stack.pop();
                String expr = "(" + a + token + b + ")";
                stack.push(expr);
            } else {
                stack.push(token);  
            }
        }
        System.out.println(stack.pop());
    }

}
