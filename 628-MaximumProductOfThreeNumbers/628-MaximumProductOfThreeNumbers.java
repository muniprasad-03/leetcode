// Last updated: 04/04/2026, 23:33:37
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int m1 = nums[len-1] * nums[len-2] * nums[len-3];
        int m2 = nums[0] * nums[1] * nums[len-1];
        return Math.max(m1,m2);
    }
}