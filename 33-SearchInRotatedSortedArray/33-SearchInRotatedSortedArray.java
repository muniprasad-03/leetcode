// Last updated: 04/04/2026, 23:38:35
class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length;
        int start = 0;
        int end = l-1;
        while(start<=end) {
            int mid = (start)+(end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[start]<=nums[mid]) {
                if(nums[start]<=target && nums[mid]>=target) {
                    end=mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(nums[mid]<=target && target<=nums[end]) {
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}