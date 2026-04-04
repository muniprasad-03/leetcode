// Last updated: 04/04/2026, 23:28:38
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int idx = 0;
        while(idx+1<n && nums[idx]<nums[idx+1]) {idx++;}
        int p = idx;
        while(idx+1<n && nums[idx]>nums[idx+1]) {idx++;}
        int q = idx;
        while(idx+1<n && nums[idx]<nums[idx+1]) {idx++;}
        boolean reachedEnd = (idx==n-1);
        boolean validIndices = (0<p) && (p<q) && (q<n-1);
        return reachedEnd && validIndices;
    }
}