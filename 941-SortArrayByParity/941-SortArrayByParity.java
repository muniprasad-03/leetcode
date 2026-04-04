// Last updated: 04/04/2026, 23:32:36
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int i = 0;
        while(i < len && nums[i] % 2 == 0) {
            i++;
        }
        int j = i+1;
        while(j < len) {
            if(nums[j]%2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}