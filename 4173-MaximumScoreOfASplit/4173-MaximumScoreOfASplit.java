// Last updated: 04/04/2026, 23:26:48
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] suffMin = new int[n];
        suffMin[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            suffMin[i] = Math.min(suffMin[i+1], nums[i]);
        }
        long ans = Long.MIN_VALUE;
        long currPsum = 0;
        for(int i=0;i<n-1;i++) {
            currPsum += nums[i];
            long currScore = currPsum - (long)suffMin[i+1];
            if(currScore>ans) ans = currScore;
        }
        return ans;
    }
}