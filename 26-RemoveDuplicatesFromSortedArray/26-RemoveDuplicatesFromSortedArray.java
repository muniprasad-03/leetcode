// Last updated: 04/04/2026, 23:38:38
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j;
        for(j=i+1;j<nums.length;j++) {
            if(nums[i]!=nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}