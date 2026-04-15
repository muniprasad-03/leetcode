// Last updated: 16/04/2026, 00:48:57
1class Solution {
2    int[][] memo = new int[13][10001];
3    public int solve(int idx, int[] coins, int amount) {
4        if(amount == 0) return 0;
5        if(idx < 0 || amount < 0) return Integer.MAX_VALUE;
6        if(memo[idx][amount] != -1) return memo[idx][amount];
7        int include = solve(idx, coins, amount - coins[idx]);
8        if(include != Integer.MAX_VALUE) include++;
9        int notInclude = solve(idx-1, coins, amount);
10        return memo[idx][amount] = Math.min(include, notInclude);
11    }
12    public int coinChange(int[] coins, int amount) {
13        Arrays.sort(coins);
14        for(int[] row : memo) Arrays.fill(row, -1);
15        int ans = solve(coins.length-1, coins, amount);
16        return ans == Integer.MAX_VALUE ? -1 : ans;
17    }
18}