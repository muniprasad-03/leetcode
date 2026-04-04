// Last updated: 04/04/2026, 23:37:40
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) return 2;
        int i = 2;
        for(int j = 2;j<n;j++) {
            if(nums[j] != nums[i-2]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}