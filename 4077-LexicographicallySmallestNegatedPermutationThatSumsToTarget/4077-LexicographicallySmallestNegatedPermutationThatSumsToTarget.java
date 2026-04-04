// Last updated: 04/04/2026, 23:27:38
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long maxSum = ((long)n*(n+1))/2;
        if(target > maxSum || target < -maxSum) {
            return new int[0];
        }
        if(maxSum%2 != Math.abs(target)%2) {
            return new int[0];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            ans[i] = i+1;
        }
        long diffReq = (maxSum - target)/2;
        for(int i=n;i>0;i--) {
            if(diffReq >= i) {
                diffReq-=i;
                ans[i-1] = -ans[i-1];
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}