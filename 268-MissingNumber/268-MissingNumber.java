// Last updated: 04/04/2026, 23:35:12
class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2;
        for(int i=0;i<l;i++) {
            sum -= nums[i];
        }
        return sum;
    }
}