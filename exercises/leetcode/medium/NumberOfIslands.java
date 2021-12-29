// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
public class NumberOfIslands {
    
    boolean[][] visited;
    
    public int numIslands(char[][] grid) {
        this.visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                this.visited[i][j] = false;
            }
        }
        int count = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(!this.visited[i][j] && grid[i][j] == '1') {
                    this.visited[i][j] = true;
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
            if(!this.visited[i-1][j]) {
                this.visited[i-1][j] = true;
                if(grid[i-1][j] == '1') {
                    visitAdjacent(grid, i-1, j);
                }
            }
        }
        // down
        if(i<grid.length-1) {
            if(!this.visited[i+1][j]) {
                this.visited[i+1][j] = true;
                if(grid[i+1][j] == '1') {
                    visitAdjacent(grid, i+1, j);
                }
            }
        }
        // left
        if(j>0) {
            if(!this.visited[i][j-1]) {
                this.visited[i][j-1] = true;
                if(grid[i][j-1] == '1') {
                    visitAdjacent(grid, i, j-1);
                }
            }
        }
        // right
        if(j<grid[0].length-1) {
            if(!this.visited[i][j+1]) {
                this.visited[i][j+1] = true;
                if(grid[i][j+1] == '1') {
                    visitAdjacent(grid, i, j+1);
                }
            }
        }
    }
}