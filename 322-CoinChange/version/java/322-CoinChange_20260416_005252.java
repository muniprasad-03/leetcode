// Last updated: 16/04/2026, 00:52:52
1class Solution {
2    int[] memo;
3    public int solve(int[] coins, int amount) {
4        if (amount == 0) return 0;
5        if (amount < 0) return (int)1e9;
6        if (memo[amount] != -1) return memo[amount];
7        int min = (int)1e9;
8        for (int coin : coins) {
9            int res = solve(coins, amount - coin);
10            if (res != (int)1e9) {
11                min = Math.min(min, res + 1);
12            }
13        }
14        return memo[amount] = min;
15    }
16    public int coinChange(int[] coins, int amount) {
17        memo = new int[amount + 1];
18        Arrays.fill(memo, -1);
19        int ans = solve(coins, amount);
20        return ans >= (int)1e9 ? -1 : ans;
21    }
22}