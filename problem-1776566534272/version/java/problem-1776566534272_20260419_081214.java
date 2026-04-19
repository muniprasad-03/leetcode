// Last updated: 19/04/2026, 08:12:14
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        if(n == 0) return -1;
5        int[] suffMin = new int[n];
6        suffMin[n-1] = nums[n-1];
7        for(int i = n-2; i >= 0; i--) {
8            suffMin[i] = Math.min(nums[i], suffMin[i+1]);
9        }
10        int currentMax = Integer.MIN_VALUE;
11        for(int i = 0; i < n; i++) {
12            currentMax = Math.max(currentMax, nums[i]);
13            if(currentMax-suffMin[i] <= k) {
14                return i;
15            }
16        }
17        return -1;
18    }
19}