// Last updated: 04/04/2026, 23:29:44
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i += 2;
            j += 2;
        }
        return nums;
    }
}