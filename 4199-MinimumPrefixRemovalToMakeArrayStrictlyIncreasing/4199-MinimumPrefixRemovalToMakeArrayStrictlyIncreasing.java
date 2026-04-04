// Last updated: 04/04/2026, 23:26:32
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n = nums.length;
        int idx = n-1;
        while(idx>0 && nums[idx-1]<nums[idx]) {
            idx--;
        }
        return idx;
    }
}