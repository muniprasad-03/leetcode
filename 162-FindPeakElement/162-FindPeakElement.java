// Last updated: 04/04/2026, 23:36:25
class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if(len==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[len-1]>nums[len-2]) return len-1;
        int start = 1;
        int end = len-2;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
                return mid;
            } else if(nums[mid] < nums[mid+1]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}