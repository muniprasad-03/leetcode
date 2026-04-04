// Last updated: 04/04/2026, 23:28:20
class Solution {
    public int minOperations(int[] nums) {
        int tarAnd = nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++) {
            tarAnd = tarAnd & nums[i];
        }
        for(int num : nums) {
            if(num != tarAnd) {
                return 1;
            }
        }
        return 0;
    }
}