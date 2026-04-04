// Last updated: 04/04/2026, 23:29:05
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            if(nums[i] == 0) {
                ans[i] = 0;
            } else {
                boolean isNeg = nums[i]<0;
                int abs = Math.abs(nums[i]);
                int j = i;
                while(abs > 0) {
                    abs--;
                    j += isNeg ? -1 : 1;
                    if(j == -1) j = n-1;
                    if(j == n) j = 0;
                }
                ans[i] = nums[j];
            }
        }
        return ans;
    }
}