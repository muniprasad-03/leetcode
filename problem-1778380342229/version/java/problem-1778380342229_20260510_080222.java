// Last updated: 10/05/2026, 08:02:22
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int[] ans =  new int[2*n];
5        int idx = 0;
6        for(int i=0;i<n;i++) {
7            ans[idx++] = nums[i];
8        }
9        for(int i=n-1;i>=0;i--) {
10            ans[idx++] = nums[i];
11        }
12        return ans;
13    }
14}