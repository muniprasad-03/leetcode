// Last updated: 13/04/2026, 21:05:08
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int ans = 0;
4        int dist = 1001;
5        for(int i=0; i<nums.length; i++) {
6            if(nums[i] == target) {
7                int diff = Math.abs(i - start);
8                if(diff < dist) {
9                    ans = diff;
10                    dist = diff;
11                }
12            }
13        }
14        return ans;
15    }
16}