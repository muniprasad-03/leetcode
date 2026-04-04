// Last updated: 04/04/2026, 23:27:21
class Solution {
    public int minMoves(int[] nums) {
        int m = Integer.MIN_VALUE;
        for(int num : nums) {
            m = Math.max(m,num);
        }
        int ans = 0;
        for(int num : nums) {
            if(num < m) {
                ans += (m-num);
            }
        }
        return ans;
    }
}