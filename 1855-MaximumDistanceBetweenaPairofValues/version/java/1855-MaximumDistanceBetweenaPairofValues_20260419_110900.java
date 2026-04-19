// Last updated: 19/04/2026, 11:09:00
1class Solution {
2    public int binarySearch(int[] nums, int target) {
3        int start = 0;
4        int end = nums.length - 1;
5        int res = -1;
6        while(start <= end) {
7            int mid = start + (end - start) / 2;
8            if (nums[mid] >= target) {
9                res = mid; 
10                start = mid + 1;
11            } else {
12                end = mid - 1;
13            }
14        }
15        return res;
16    }
17    public int maxDistance(int[] nums1, int[] nums2) {
18        int ans = 0;
19        for(int i = 0; i < nums1.length; i++) {
20            int j = binarySearch(nums2, nums1[i]);
21            if(i <= j) {
22                ans = Math.max(ans, j - i);
23            }
24        }
25        return ans;
26    }
27}