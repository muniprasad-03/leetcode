// Last updated: 04/04/2026, 23:27:23
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (nums[n-1]+nums[n-2]-nums[0]);
    }
}