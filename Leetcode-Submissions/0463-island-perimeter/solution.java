class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int perimeter = 0;

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    for(int k=0;k<4;k++){
                        int nRow = i+delRow[k];
                        int nCol = j+delCol[k];

                        if(nRow<0 || nCol<0 || nRow>=n || nCol>=m || grid[nRow][nCol]==0){
                            perimeter++;
                        }
                    }
                }
            }
        }
        return perimeter;
    }
}
