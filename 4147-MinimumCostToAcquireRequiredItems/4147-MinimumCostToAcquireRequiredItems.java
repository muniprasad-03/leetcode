// Last updated: 04/04/2026, 23:27:03
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = Long.MAX_VALUE;
        int[] arr = {0,need1,need2};
        for(int x : arr) {
            long rem1 = Math.max(0L, (long)need1-x);
            long rem2 = Math.max(0L, (long)need2-x);
            long curr = ((long)x*costBoth)+(rem1*cost1)+(rem2*cost2);
            ans = Math.min(ans, curr);
        }
        return ans;
    }
}