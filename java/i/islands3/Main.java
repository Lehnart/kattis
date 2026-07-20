import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static class Position{
        public final int x;
        public final int y;
        public Integer islandId;

        public Position(int x, int y, Integer islandId) {
            this.x = x;
            this.y = y;
            this.islandId = islandId;
        }

        public boolean equals(Object o){
            if(this == o) return true;
            if(!(o instanceof Position)) return false;
            Position p = (Position) o;
            return this.x == p.x && this.y == p.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        Set<Position> lands = new HashSet<>();
        Set<Position> clouds = new HashSet<>();

        Character[][] grid = new Character[r][c];
        for(int i =0; i<r;i++){
            String s = sc.next();
            for(int j =0; j<c;j++){
                grid[i][j] = s.charAt(j);
                if(grid[i][j] == 'L'){
                    lands.add(new Position(j,i, null));
                } else if (grid[i][j] == 'C') {
                    clouds.add(new Position(j,i, null));
                }
            }
        }
        sc.close();

        int islandCount = 0;
        for(Position land : lands){
            if(land.islandId != null){
                continue;
            }
            islandCount++;
            Set<Position> toVisit = new HashSet<>();
            land.islandId = islandCount;
            toVisit.add(land);
            while(!toVisit.isEmpty()){
                Position current = toVisit.iterator().next();
                toVisit.remove(current);
                current.islandId = land.islandId;
                for(int dx = -1; dx <= 1; dx++){
                    for(int dy = -1; dy <= 1; dy++){
                        if(Math.abs(dx) + Math.abs(dy) != 1){
                            continue;
                        }
                        int nx = current.x + dx;
                        int ny = current.y + dy;
                        Position neighbor = new Position(nx, ny, land.islandId);
                        if(lands.contains(neighbor)){
                            Position actualNeighbor = lands.stream().filter(p -> p.x == nx && p.y == ny).findFirst().orElse(null);
                            if(actualNeighbor != null && actualNeighbor.islandId == null) {
                                actualNeighbor.islandId = land.islandId;
                                toVisit.add(actualNeighbor);
                            }
                        }
                        else if(clouds.contains(neighbor)){
                            Position actualNeighbor = clouds.stream().filter(p -> p.x == nx && p.y == ny).findFirst().orElse(null);
                            if(actualNeighbor != null && actualNeighbor.islandId == null) {
                                actualNeighbor.islandId = land.islandId;
                                toVisit.add(actualNeighbor);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(islandCount);
    }
}
