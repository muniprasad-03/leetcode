// Last updated: 04/04/2026, 23:32:32
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] <= nums[i-1]) {
                int newValue = nums[i-1]+1;
                ans += (newValue - nums[i]);
                nums[i] = newValue;
            }
        }
        return ans;
    }
}