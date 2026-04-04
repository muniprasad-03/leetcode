// Last updated: 04/04/2026, 23:29:32
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0] <= k) ans++;
        for(int i=1;i<n;i++) {
            grid[0][i] = grid[0][i-1] + grid[0][i];
            if(grid[0][i] <= k) ans++;
        }
        for(int i=1;i<m;i++) {
            grid[i][0] = grid[i-1][0] + grid[i][0];
            if(grid[i][0] <= k) ans++;
        }
        for(int i=1;i<m;i++) {
            for(int j=1;j<n;j++) {
                int top = grid[i-1][j];
                int left = grid[i][j-1];
                int topLeft = grid[i-1][j-1];
                grid[i][j] = grid[i][j] + top + left - topLeft;
                if(grid[i][j] <= k) ans++;
            }
        }
        return ans;
    }
}