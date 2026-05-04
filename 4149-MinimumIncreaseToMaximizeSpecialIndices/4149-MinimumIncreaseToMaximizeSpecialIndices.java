// Last updated: 04/05/2026, 23:31:37
class Solution {
    public long minIncrease(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        long[][] dp = new long[n][2];
        dp[0][0] = 0; 
        dp[0][1] = 0;
        long cost1 = Math.max(0,(long) Math.max(nums[0], nums[2])+1-nums[1]);
        dp[1][0] = 1;
        dp[1][1] = cost1;
        for(int i = 2; i < n-1; i++) {
            long resCnt = dp[i-1][0];
            long resCost = dp[i-1][1];
            long currCost = Math.max(0,(long) Math.max(nums[i-1], nums[i+1])+1-nums[i]);
            long takeCnt = dp[i-2][0]+1;
            long takeCost = dp[i-2][1]+currCost;
            if(takeCnt > resCnt) {
                resCnt = takeCnt;
                resCost = takeCost;
            } else if(takeCnt == resCnt) {
                resCost = Math.min(resCost, takeCost);
            }
            dp[i][0] = resCnt;
            dp[i][1] = resCost;
        }
        return dp[n-2][1];
    }
}