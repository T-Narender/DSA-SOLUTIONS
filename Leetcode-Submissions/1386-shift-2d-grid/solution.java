class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int len = m*n;
        k = k%len;
        if(k > 0){
        reverse(grid,0,len-1);
        reverse(grid,0,k-1);
        reverse(grid,k,len-1); 
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }
            result.add(row);
        }

        return result;
    }

    private void reverse(int[][] grid,int l,int r){
        int cols = grid[0].length;
        while(l<r){
            int r1 = l/cols;
            int c1 = l%cols;
            int r2 = r/cols;
            int c2 = r%cols;
            //swap
            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;
            l++;
            r--;

        }
    }
}
