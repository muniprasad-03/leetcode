// Last updated: 04/04/2026, 23:27:24
class Solution {
    public long maxProduct(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        for (int num : nums) {
            long current = Math.abs((long)num);
            if (current > firstMax) {
                secondMax = firstMax;
                firstMax = current;
            } else if (current > secondMax) {
                secondMax = current;
            }
        }
        long constVal = 100000L;
        long ans = firstMax*secondMax*constVal;
        return ans;
    }
}