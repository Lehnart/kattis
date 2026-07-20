import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static record Problem(int n, int d, int m, List<Integer> ints){}

    public static record Path(Set<Integer> visitedIndices, int currentIndex){}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> ints = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            ints.add(sc.nextInt());
        }
        sc.close();
    
        Problem prob = new Problem(n,d,m,ints);
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            int length = computeMaxLengthFromIndex(i, prob);
            if (length > maxLength){
                maxLength = length;
            }             
        }
        System.out.println(maxLength);
    }

    public static int computeMaxLengthFromIndex(int startingIndex, Problem prob){
        Set<Integer> visitedIndices = new HashSet<>((int) Math.round(Math.sqrt(prob.n)));
        visitedIndices.add(startingIndex);
        Path p = new Path(visitedIndices, startingIndex);

        Set<Path> nextPaths = new HashSet<>();
        nextPaths.add(p);

        int length = 0;
        while (!nextPaths.isEmpty()){
            length = nextPaths.iterator().next().visitedIndices.size();
            nextPaths = explorePaths(nextPaths, prob);
        }
        return length;
    }

    public static Set<Path> explorePaths(Set<Path> nextPaths, Problem prob){
        Set<Path> newPaths = new HashSet<>(nextPaths.size());
        for(Path p : nextPaths){
            newPaths.addAll(explorePath(p, prob));
        }
        return newPaths;
    }

    public static Set<Path> explorePath(Path p, Problem prob){
        List<Integer> validIndices = findIndices(p, prob);
        List<Integer> validJumps = findJumps(p,prob, validIndices);
        Set<Path> paths = new HashSet<>(validJumps.size());
        for(Integer jump:validJumps){
            Set<Integer> visitedIndices = new HashSet<>();
            visitedIndices.addAll(p.visitedIndices);
            visitedIndices.add(jump);
            paths.add(new Path(visitedIndices, jump));
        }
        return paths;
    }

    public static List<Integer> findIndices(Path p, Problem prob){
        List<Integer> validIndices = new ArrayList<>();
        for(int i = p.currentIndex - prob.d; i <= p.currentIndex + prob.d;i++){
            if(i < 0 || i >= prob.ints.size() || i == p.currentIndex || p.visitedIndices.contains(i)){
                continue;
            }
            validIndices.add(i);
        }
        return validIndices;
    }

    public static List<Integer> findJumps(Path p, Problem prob, List<Integer> indices){
        List<Integer> validJumps = new ArrayList<>();
        for(int i : indices){
            int delta = prob.ints.get(i) - prob.ints.get(p.currentIndex);
            delta = Math.abs(delta);
            if(delta > prob.m){
                continue;
            }
            validJumps.add(i);
        }
        return validJumps;
    }
}
