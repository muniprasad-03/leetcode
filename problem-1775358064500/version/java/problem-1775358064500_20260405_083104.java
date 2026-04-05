// Last updated: 05/04/2026, 08:31:04
1class Solution {
2    public long minIncrease(int[] nums) {
3        int n = nums.length;
4        if(n < 3) return 0;
5        long[][] dp = new long[n][2];
6        dp[0][0] = 0; 
7        dp[0][1] = 0;
8        long cost1 = Math.max(0,(long) Math.max(nums[0], nums[2])+1-nums[1]);
9        dp[1][0] = 1;
10        dp[1][1] = cost1;
11        for(int i = 2; i < n-1; i++) {
12            long resCnt = dp[i-1][0];
13            long resCost = dp[i-1][1];
14            long currCost = Math.max(0,(long) Math.max(nums[i-1], nums[i+1])+1-nums[i]);
15            long takeCnt = dp[i-2][0]+1;
16            long takeCost = dp[i-2][1]+currCost;
17            if(takeCnt > resCnt) {
18                resCnt = takeCnt;
19                resCost = takeCost;
20            } else if(takeCnt == resCnt) {
21                resCost = Math.min(resCost, takeCost);
22            }
23            dp[i][0] = resCnt;
24            dp[i][1] = resCost;
25        }
26        return dp[n-2][1];
27    }
28}