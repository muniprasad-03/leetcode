// Last updated: 04/04/2026, 23:30:30
class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=i;j<n;j++) {
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                ans+=(long)(max-min);
            }
        }
        return ans;
    }
}