// Last updated: 04/04/2026, 23:33:25
class Solution {
    int[][] grid;
    int n,m;
    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1) {
                    ans = Math.max(ans, calculateArea(i,j));
                }
            }
        }
        return ans;
    }
    private int calculateArea(int i, int j) {
        if(i<0 || i==n || j<0 || j==m) return 0;
        if(grid[i][j] == -1 || grid[i][j] == 0) return 0;
        
        grid[i][j] = -1;
        int top = calculateArea(i-1,j);
        int left = calculateArea(i,j-1);
        int right = calculateArea(i,j+1);
        int down = calculateArea(i+1,j);

        return 1+top+left+right+down;
    }
}