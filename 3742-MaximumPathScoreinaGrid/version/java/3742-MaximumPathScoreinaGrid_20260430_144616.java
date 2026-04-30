// Last updated: 30/04/2026, 14:46:16
1class Solution {
2    static final int INT_MIN = Integer.MIN_VALUE;
3    private int[][] grid;
4    private int m, n, k;
5    private Integer[][][] dp;
6    private int solve(int row, int col, int cost) {
7        if(row >= m || col >= n) return INT_MIN;
8
9        int newCost = cost + (grid[row][col] == 0 ? 0 : 1);
10        if(newCost > k) return INT_MIN;
11
12        if(row == m-1 && col == n-1) return grid[row][col];
13
14        if(dp[row][col][newCost] != null) return dp[row][col][newCost];
15
16        int right = solve(row, col + 1, newCost);
17        int down = solve(row + 1, col, newCost);
18        
19        if(right == INT_MIN && down == INT_MIN) return dp[row][col][newCost] =  INT_MIN;
20        return dp[row][col][newCost] = Math.max(right, down) + grid[row][col];
21    }
22    public int maxPathScore(int[][] grid, int k) {
23        this.grid = grid;
24        this.k = k;
25        this.m = grid.length;
26        this.n = grid[0].length;
27        this.dp = new Integer[m][n][k+1];
28        int val = solve(0, 0, 0);
29        return val == INT_MIN ? -1 : val;
30    }
31}