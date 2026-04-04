// Last updated: 04/04/2026, 23:30:43
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i=0; i<len; i++) {
            ans[i] = nums[i];
            ans[len+i] = nums[i];
        }
        return ans;
    }
}