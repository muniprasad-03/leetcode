// Last updated: 04/04/2026, 23:28:15
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        if(nums.length<=1) {
            return 0;
        }
        int minV=nums[0];
        int maxV=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<minV) {
                minV=nums[i];
            }
            if(nums[i]>maxV) {
                maxV=nums[i];
            }
        }
        long maxSingVal = (long)maxV-minV;
        return maxSingVal*k;
    }
}
