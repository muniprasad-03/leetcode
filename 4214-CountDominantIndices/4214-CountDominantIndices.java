// Last updated: 04/04/2026, 23:26:26
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int sum = nums[n-1];
        int cnt = 1;
        int ans = 0;
        for(int i=n-2;i>=0;i--) {
            if((double)nums[i] > ((double)sum/cnt)) {
                ans++;
            }
            cnt++;
            sum += nums[i];
        }
        return ans;
    }
}