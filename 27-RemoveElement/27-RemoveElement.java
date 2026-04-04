// Last updated: 04/04/2026, 23:38:43
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while(i<n && nums[i]!=val) {
            i++;
        }
        int j=i+1;
        for(;j<n;j++) {
            if(nums[j]!=val) {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}