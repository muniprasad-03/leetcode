// Last updated: 04/04/2026, 23:28:16
class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length;
        if(len<=2) return len;
        int right = 2;
        int ans = 2;
        int tempLen = 2;
        while(right<len) {
            if(nums[right]==nums[right-1]+nums[right-2]) {
                tempLen++;
            } else {
                tempLen=2;
            }
            right++;
            ans=Math.max(ans,tempLen);
        }
        return ans;
    }
}