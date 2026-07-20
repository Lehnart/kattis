import java.util.Scanner;

public class Main {

    public static class Score{
        public int t;
        public int h;
        public Score(int t, int h){
            this.t = t;
            this.h = h;
        }
        public boolean isOver(){
            if(t < 11 && h < 11) return false;
            if( t >= h + 2  || h >= t + 2) return true;
            return false;
        }
        public void reset(){
            this.t = 0;
            this.h = 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      
        String s = sc.nextLine();
        sc.close();

        Score score = new Score(0, 0);
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c == 'T') score.t++;
            else score.h++;
            if(score.isOver()){
                score.reset();
            }
        }
        System.out.println(score.t + "-" + score.h);
}
}
