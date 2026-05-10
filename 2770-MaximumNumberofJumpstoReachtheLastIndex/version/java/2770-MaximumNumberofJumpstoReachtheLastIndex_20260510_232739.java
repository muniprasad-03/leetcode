// Last updated: 10/05/2026, 23:27:39
1class Solution {
2    public int maximumJumps(int[] nums, int target) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, -1);
6        dp[0] = 0;
7        for(int i=0;i<n;i++) {
8            if(dp[i] == -1) continue;
9            for(int j=i+1;j<n;j++) {
10                if(Math.abs(nums[i] - nums[j]) <= target) {
11                    dp[j] = Math.max(dp[j], dp[i]+1);
12                }
13            }
14        }
15        return dp[n-1];
16    }
17}