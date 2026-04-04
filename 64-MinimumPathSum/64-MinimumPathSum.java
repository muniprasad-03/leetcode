// Last updated: 04/04/2026, 23:38:00
class Solution {
    int[][] grid;
    int m,n;
    int[][] cache;
    public int dfs(int i, int j) {
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(cache[i][j] != -1) return cache[i][j];
        if(i == 0 && j == 0) return grid[0][0];
        int fromTop = dfs(i-1, j);
        int fromLeft = dfs(i, j-1);
        return cache[i][j] = grid[i][j] + Math.min(fromTop, fromLeft);
    }
    public int minPathSum(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        cache = new int[m][n];
        for(int[] row : cache) {
            Arrays.fill(row, -1);
        }
        return dfs(m-1,n-1);
    }
}