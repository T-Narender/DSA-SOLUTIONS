class Solution {
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int numEnclaves(int[][] grid) {
        // Handle empty grid
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int n = grid.length, m = grid[0].length;

        int[][] vis = new int[n][m];

        Queue<Pair> q = new LinkedList<Pair>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    if (grid[i][j] == 1) {
                        vis[i][j] = 1;
                        q.add(new Pair(i,j));
                    }
                }
            }
        }

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

            for (int k = 0; k < 4; k++) {
                int nrow = row + delrow[k];
                int ncol = col + delcol[k];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && vis[nrow][ncol]==0 && grid[nrow][ncol] == 1) {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow,ncol));
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j]==0) cnt++;
            }
        }
        return cnt;
    }
}
