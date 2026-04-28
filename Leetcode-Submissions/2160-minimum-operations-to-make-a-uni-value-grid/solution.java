import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }

        int L = list.size();

        Collections.sort(list);

        int target = list.get(L / 2);

        int result = 0;

        for (int num : list) {
            // Difference must be divisible by x
            if (Math.abs(num - target) % x != 0) {
                return -1;
            }

            result += Math.abs(num - target) / x;
        }

        return result;
    }
}
