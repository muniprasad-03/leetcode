// Last updated: 04/04/2026, 23:28:54
class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int icount = 0;
        int[] dir = {-1, 0, 1, 0, -1}; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !vis[i][j]) {
                    int islandSum = dfs(i, j, grid, vis, dir, m, n);
                    if (islandSum % k == 0) {
                        icount++;
                    }
                }
            }
        }
        return icount;
    }

    public int dfs(int i, int j, int[][] grid, boolean[][] vis, int[] dir, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || grid[i][j] == 0) {
            return 0;
        }
        vis[i][j] = true;
        int sum = grid[i][j];
        for (int d = 0; d < 4; d++) {
            int newI = i + dir[d];
            int newJ = j + dir[d + 1];
            sum += dfs(newI, newJ, grid, vis, dir, m, n);
        }
        return sum;
    }
}
