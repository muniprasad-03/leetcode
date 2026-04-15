// Last updated: 16/04/2026, 00:57:47
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int INF = (int)1e9;
4        int[] memo = new int[amount+1];
5        Arrays.fill(memo, INF);
6        memo[0] = 0;
7        for (int i = 1; i <= amount; i++) {
8            for (int coin : coins) {
9                if (i-coin >= 0) {
10                    memo[i] = Math.min(memo[i], memo[i-coin]+1);
11                }
12            }
13        }
14        return memo[amount] >= INF ? -1 : memo[amount];
15    }
16}