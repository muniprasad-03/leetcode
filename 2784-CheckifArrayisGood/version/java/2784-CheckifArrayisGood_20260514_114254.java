// Last updated: 14/05/2026, 11:42:54
1class Solution {
2    public boolean isGood(int[] nums) {
3        int n = nums.length;
4        Arrays.sort(nums);
5        for(int i=0;i<n-1;i++) {
6            if(nums[i] != i+1) return false;
7        }
8        return nums[n-1] == n-1;
9    }
10}