// Last updated: 04/04/2026, 23:33:32
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate=0;
        int missed=0;
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) duplicate=nums[i];
            if(nums[i+1]-nums[i]==2) missed=nums[i]+1; 
        }
        if(nums[0]!=1) missed=1;
        else if(nums[nums.length-1]!=nums.length) missed=nums.length;
        return new int[]{duplicate,missed};
    }
}