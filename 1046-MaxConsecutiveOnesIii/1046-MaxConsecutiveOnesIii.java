// Last updated: 04/04/2026, 23:32:17
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int cntZero = 0;
        int ans = 0;
        while(right < nums.length) {
            if(nums[right]==0) {
                cntZero++;
            }
            while(cntZero>k) {
                if(nums[left]==0) {
                    cntZero--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}