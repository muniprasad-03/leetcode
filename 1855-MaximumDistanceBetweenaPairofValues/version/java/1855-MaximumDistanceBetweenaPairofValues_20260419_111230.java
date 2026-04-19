// Last updated: 19/04/2026, 11:12:30
1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int i = 0;
4        int j = 0;
5        int ans = 0;
6        while(i < nums1.length && j < nums2.length) {
7            if(nums1[i] <= nums2[j]) {
8                ans = Math.max(ans, j - i);
9                j++;
10            } else {
11                i++;
12            }
13        }
14        return ans;
15    }
16}