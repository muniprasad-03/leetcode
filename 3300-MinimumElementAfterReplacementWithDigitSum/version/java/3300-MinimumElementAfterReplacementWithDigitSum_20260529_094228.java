// Last updated: 29/05/2026, 09:42:28
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = digitSum(nums[i]);
            min = Math.min(nums[i],min);
        }
        return min;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num  % 10;
            num/= 10;
        }
        return sum;
    }
}