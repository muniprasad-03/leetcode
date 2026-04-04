// Last updated: 04/04/2026, 23:35:57
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(j<n) {
            sum += nums[j]; //increase window
            while(sum >= target) { 
                minLen = Math.min(minLen, j-i+1); //decrease window
                sum -= nums[i++];
            }
            j++;
        }
        return minLen==Integer.MAX_VALUE ? 0:minLen;
    }
}