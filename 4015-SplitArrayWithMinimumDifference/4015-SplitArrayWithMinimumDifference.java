// Last updated: 04/04/2026, 23:28:06
class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        boolean[] canBeLeft=new boolean[n];
        canBeLeft[0]=true;
        for(int i=1;i<n;i++) {
            canBeLeft[i]=canBeLeft[i-1] && nums[i]>nums[i-1];
        }
        boolean[] canBeRight=new boolean[n];
        canBeRight[n-1]=true;
        for(int i=n-2;i>=0;i--) {
            canBeRight[i]=canBeRight[i+1] && nums[i]>nums[i+1];
        }
        long[] prefixSum=new long[n+1];
        for(int i=0;i<n;i++) {
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        long minDiff=Long.MAX_VALUE;
        boolean validSplit=false;
        for(int i=0;i<n-1;i++) {
            if(canBeLeft[i] && canBeRight[i+1]) {
                validSplit=true;
                long leftSum=prefixSum[i+1];
                long rightSum=prefixSum[n]-prefixSum[i+1];
                long diff=Math.abs(leftSum-rightSum);
                minDiff=Math.min(minDiff,diff);
            }
        }
        if(!validSplit) {
            return -1;
        }
        return minDiff;
    }
}