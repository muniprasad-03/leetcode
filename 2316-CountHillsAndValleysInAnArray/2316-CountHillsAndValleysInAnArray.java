// Last updated: 04/04/2026, 23:30:20
class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int hills = 0, valleys = 0;
        int i = 0;
        while(i < n -1) {
            int left = i-1;
            while(left>=0 && nums[left]==nums[i]) {
                left--;
            }
            int right = i+1;
            while(right < n && nums[right]==nums[i]) {
                right++;
            }
            if(left >=0 && right < n) {
                if(nums[left] < nums[i] && nums[i] > nums[right]) {
                    hills++;
                } else if(nums[left] > nums[i] && nums[i] < nums[right]) {
                    valleys++;
                }
            }
            i = right;
        }
        return hills + valleys;
    }
}
