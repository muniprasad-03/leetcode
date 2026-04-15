// Last updated: 16/04/2026, 00:50:53
1class Solution {
2    int[][] memo = new int[13][10001];
3    int INF = (int)1e9;
4    public int solve(int idx, int[] coins, int amount) {
5        if(amount == 0) return 0;
6        if(idx < 0 || amount < 0) return INF;
7        if(memo[idx][amount] != -1) return memo[idx][amount];
8        int include = solve(idx, coins, amount - coins[idx]);
9        if(include != INF) include++;
10        int notInclude = solve(idx-1, coins, amount);
11        return memo[idx][amount] = Math.min(include, notInclude);
12    }
13    public int coinChange(int[] coins, int amount) {
14        for(int[] row : memo) Arrays.fill(row, -1);
15        int ans = solve(coins.length-1, coins, amount);
16        return ans == INF ? -1 : ans;
17    }
18}