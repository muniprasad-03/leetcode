// Last updated: 14/05/2026, 11:45:40
1class Solution {
2    public boolean isGood(int[] nums) {
3        int n = nums.length;
4        int[] freq = new int[n];
5        for(int num : nums) {
6            if(num >= n) return false;
7            if(num < n-1 && freq[num] > 0) return false;
8            if(num == n-1 && freq[num] > 1) return false;
9            freq[num]++;
10        } 
11        return true;
12    }
13}