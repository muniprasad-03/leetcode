// Last updated: 04/04/2026, 23:38:31
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        if(nums[end]<target) {
            return end+1;
        }
        int ans=0;
        while(start<=end) {
            mid=(start+end)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target) {
                end=mid-1;
                ans=mid;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
}