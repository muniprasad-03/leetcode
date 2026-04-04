// Last updated: 04/04/2026, 23:38:24
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] suffixMax = new int[n];
        suffixMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }
        int leftMax = height[0];
        int ans = 0;
        for(int i=0;i<n;i++) {
            ans += Math.max(0, Math.min(leftMax, suffixMax[i]) - height[i]);
            leftMax = Math.max(leftMax, height[i]);
        }
        return ans;
    }
}