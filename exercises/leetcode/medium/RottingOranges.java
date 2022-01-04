// You are given an m x n grid where each cell can have one of three values:
// - 0 representing an empty cell,
// - 1 representing a fresh orange, or
// - 2 representing a rotten orange.
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
// Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
class Solution {
    public int orangesRotting(int[][] grid) {
        Set<Loc> fresh = new HashSet<>();
        Set<Loc> rotten = new HashSet<>();
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    Loc loc = new Loc(i, j);
                    fresh.add(loc);
                } else if(grid[i][j] == 2) {
                    Loc loc = new Loc(i, j);
                    rotten.add(loc);
                }
            }
        }

        int min = 0;
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        
        while(fresh.size() > 0) {
            Set<Loc> infected = new HashSet<>();
            for(Loc orange : rotten) {
                for(int[] direct : directions) {
                    int nextI = orange.i + direct[0];
                    int nextJ = orange.j + direct[1];
                    Loc nextLoc = new Loc(nextI, nextJ);
                    if(fresh.contains(nextLoc)) {
                        fresh.remove(nextLoc);
                        infected.add(nextLoc);
                    }
                }
            }
            
            if(infected.size() == 0) return -1;
            
            rotten.addAll(infected);
            min++;
        }
        
        return min;
    }
    
    class Loc {
        int i;
        int j;
        
        Loc(int i, int j) {
            this.i = i;
            this.j = j;
        }
        
        @Override
        public int hashCode() {
            return 21*i + 43*j;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null || !(obj instanceof Loc))
                return false;

            Loc u = (Loc) obj;

            return (u.i == i) && (u.j == j);
        }
    }
}