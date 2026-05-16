// Last updated: 16/05/2026, 18:17:32
1class Solution {
2    public int findMin(int[] nums) {
3        int start = 0;
4        int end = nums.length-1;
5        while(start < end) {
6            int mid = start + (end - start) / 2;
7            if(nums[mid] > nums[end]) {
8                start = mid + 1;
9            } else if(nums[mid] < nums[end]){
10                end = mid;
11            } else {
12                end--;
13            }
14        }
15        return nums[start];
16    }
17}