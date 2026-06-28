class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] nums) {
        Arrays.sort(nums);
        nums[0] = 1;
        int ans = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i] - nums[i - 1] > 1) {
                nums[i] = nums[i - 1] + 1;
            }
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }
}