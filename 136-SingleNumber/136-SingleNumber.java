// Last updated: 04/04/2026, 23:36:44
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            ans = ans ^ num ;
        }
        return ans;
    }
}