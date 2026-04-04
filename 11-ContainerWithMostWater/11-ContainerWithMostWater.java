// Last updated: 04/04/2026, 23:39:06
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=0;
        while(start<end) {
            int w = end-start;
            int h = Math.min(height[start],height[end]);
            ans = Math.max(ans,w*h);
            if(height[start]<height[end]) start++; else end--;
        }
        return ans;
    }
}