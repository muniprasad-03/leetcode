// Last updated: 28/06/2026, 08:16:05
1class Solution {
2    public long maxSum(int[] nums, int k, int mul) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        long ans = 0;
6        long totalSum = 0;
7        for(int i = n - 1; i >= 0 && k > 0; i--) {
8            long temp = Math.max(1, mul);
9            ans += (temp * nums[i]);
10            k--;
11            mul--;
12        }
13        return ans;
14    }
15}