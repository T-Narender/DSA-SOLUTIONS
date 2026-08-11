class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];

        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    ans[i][j] = 0;
                    q.offer(new int[]{i,j});
                }
                else{
                    ans[i][j] = -1;
                }
            }
        }

        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()){
            int[] current = q.poll();
            int row = current[0];
            int col = current[1];

            for(int[] dir : directions){
                int newRow = row+dir[0];
                int newCol = col+dir[1];
                
                if(newRow >=0 && newCol>=0 && newRow<m && newCol<n){
                    if(ans[newRow][newCol] == -1){
                        ans[newRow][newCol] = ans[row][col]+1;

                        q.offer(new int[]{newRow,newCol});
                    }
                    
                }
            }
        }
        return ans;
    }
}
