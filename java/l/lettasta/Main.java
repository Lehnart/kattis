import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] problems = sc.nextLine().strip().split(" ");
        int[] problemCount = new int[problems.length];
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                problemCount[j] += sc.nextInt();
            }
        }
        sc.close();
        int max = 0;
        int indexMax = -1;
        for(int j = 0 ; j < n; j++){
            if(problemCount[j] > max){
                max = problemCount[j];
                indexMax = j;
            }
        }

        System.out.println(problems[indexMax]);
    }
}
