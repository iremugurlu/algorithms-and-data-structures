public class NumberOfIslands {
    
    boolean[][] visited;
    
    public int numIslands(char[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                visited[i][j] = false;
            }
        }
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    visited[i][j] = true;
                    count++;
                    visitAdjacent(grid, i, j);
                }
                
            }
        }
        return count;
    }
    
    public void visitAdjacent(char[][] grid, int i, int j) {
        // up
        if(i>0) {
            if(!visited[i-1][j]) {
                visited[i-1][j] = true;
                if(grid[i-1][j] == '1') {
                    visitAdjacent(grid, i-1, j);
                }
            }
        }
        // down
        if(i<grid.length-1) {
            if(!visited[i+1][j]) {
                visited[i+1][j] = true;
                if(grid[i+1][j] == '1') {
                    visitAdjacent(grid, i+1, j);
                }
            }
        }
        // left
        if(j>0) {
            if(!visited[i][j-1]) {
                visited[i][j-1] = true;
                if(grid[i][j-1] == '1') {
                    visitAdjacent(grid, i, j-1);
                }
            }
        }
        // right
        if(j<grid[0].length-1) {
            if(!visited[i][j+1]) {
                visited[i][j+1] = true;
                if(grid[i][j+1] == '1') {
                    visitAdjacent(grid, i, j+1);
                }
            }
        }
    }
}