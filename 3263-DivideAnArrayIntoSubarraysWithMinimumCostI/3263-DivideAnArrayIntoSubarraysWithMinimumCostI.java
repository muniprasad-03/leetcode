// Last updated: 04/04/2026, 23:29:38
class Solution {
    public int minimumCost(int[] nums) {
        int firstMin = 51;
        int secondMin = 51;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if(nums[i] <= secondMin) {
                secondMin = nums[i];
            }
        }
        return nums[0]+firstMin+secondMin;
    }
}