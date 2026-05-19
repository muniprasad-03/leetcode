// Last updated: 19/05/2026, 16:11:28
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        for(int num : nums1) {
4            int idx = Arrays.binarySearch(nums2, num);
5            if(idx >= 0) return num; 
6        }
7        return -1;
8    }
9}