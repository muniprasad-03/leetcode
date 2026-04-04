// Last updated: 04/04/2026, 23:30:40
class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k <= 1) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++) {
            int curr = nums[i+k-1] - nums[i];
            ans = Math.min(ans, curr);
        }
        return ans;
    }
}