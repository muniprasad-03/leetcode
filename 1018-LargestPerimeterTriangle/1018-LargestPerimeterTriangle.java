// Last updated: 04/04/2026, 23:32:23
class Solution {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--) {
            if(nums[i-2]+nums[i-1]>nums[i]) {
                return nums[i-2]+nums[i-1]+nums[i];
            }
        }
        return 0;
    }
}