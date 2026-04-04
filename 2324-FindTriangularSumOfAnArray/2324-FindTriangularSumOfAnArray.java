// Last updated: 04/04/2026, 23:30:15
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[][] cache = new int[n][n];
        for(int i=0;i<n;i++) {
            cache[0][i]=nums[i];
        }
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                cache[i+1][j] = (cache[i][j] + cache[i][j+1])%10;
            }
        }
        return cache[n-1][0];
    }
}