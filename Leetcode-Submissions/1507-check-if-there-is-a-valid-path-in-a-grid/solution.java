class Solution {

    int m, n;
    boolean[][] visited;


    int[][] opens = {
        {},           
        {0, 1},      
        {2, 3},      
        {0, 3},       
        {1, 3},       
        {0, 2},       
        {1, 2}        
    };

  
    int[][] directions = {
        {0, -1, 1},  
        {0, +1, 0},   
        {-1, 0, 3},   
        {+1, 0, 2}    
    };

    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        return dfs(grid, 0, 0);
    }

    private boolean dfs(int[][] grid, int r, int c) {

        if (r == m - 1 && c == n - 1) return true;

        visited[r][c] = true;
        int streetType = grid[r][c];

        for (int dir : opens[streetType]) {
            int dr        = directions[dir][0];
            int dc        = directions[dir][1];
            int opposite  = directions[dir][2];

            int nr = r + dr;
            int nc = c + dc;

            if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;

            if (visited[nr][nc]) continue;

            int neighborStreet = grid[nr][nc];
            boolean handshake = false;
            for (int neighborDir : opens[neighborStreet]) {
                if (neighborDir == opposite) {
                    handshake = true;
                    break;
                }
            }

            if (handshake && dfs(grid, nr, nc)) return true;
        }

        return false;
    }
}
