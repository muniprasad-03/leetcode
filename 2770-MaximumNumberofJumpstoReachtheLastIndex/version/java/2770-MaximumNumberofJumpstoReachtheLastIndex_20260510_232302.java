// Last updated: 10/05/2026, 23:23:02
1class Solution {
2    private int[] nums;
3    private int[] dp;
4    private int target;
5    private int n;
6    private int solve(int i) {
7        if(i == n-1) return 0;
8        if(dp[i] != -2) return dp[i];
9        int steps = -1;
10        for(int j=i+1;j<n;j++) {
11            if(Math.abs(nums[i]-nums[j]) <= target) {
12                int temp = solve(j);
13                if(temp != -1) {
14                    steps = Math.max(steps, 1+temp);
15                }
16            }
17        }
18        return dp[i] = steps;
19    }
20    public int maximumJumps(int[] nums, int target) {
21        this.nums = nums;
22        this.n = nums.length;
23        this.dp = new int[n];
24        Arrays.fill(dp, -2);
25        this.target = target;
26        return solve(0);
27    }
28}