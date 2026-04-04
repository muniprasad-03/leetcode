// Last updated: 04/04/2026, 23:33:51
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int len = nums.length;
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[len-1]!=nums[len-2]) return nums[len-1];
        int start = 0;
        int end = len -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]) return nums[mid];
            else if(mid%2==0) {
                if(nums[mid]==nums[mid-1]) end = mid-1;
                else start = mid+1;
            } else {
                if(nums[mid]==nums[mid+1]) end = mid-1;
                else start = mid+1;
            }
        }
        return 0;
    }
}