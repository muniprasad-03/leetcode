// Last updated: 04/04/2026, 23:35:08
class Solution {
    public void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        while(i<nums.length && nums[i]!=0) {
            i++;
        }
        int j = i+1;
        while(j<nums.length) {
            if(nums[j]!=0) {
                swap(nums,i,j);
                i++;
            }
            j++;
        }
    }
}