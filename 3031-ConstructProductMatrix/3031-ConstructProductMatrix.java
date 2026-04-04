// Last updated: 04/04/2026, 23:29:49
class Solution {
    static final int MOD = 12345;
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        // Step 1: suffix products
        long suffix = 1;
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                ans[i][j] =(int) suffix;
                suffix =(suffix * grid[i][j]) % MOD;
            }
        }
        // Step 2: prefix products
        long prefix = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans[i][j] =(int)((ans[i][j] * prefix) % MOD);
                prefix =(prefix * grid[i][j]) % MOD;
            }
        }

        return ans;
    }
}