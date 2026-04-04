// Last updated: 04/04/2026, 23:27:56
class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] cache = new long[n+1];
        cache[0] = 0;
        for(int i=1;i<=n;i++) {
            long lanCost=costs[i-1];
            long minPrevCost = cache[i-1]+1;
            if(i>=2) {
                minPrevCost=Math.min(minPrevCost, cache[i-2]+4);
            }
            if(i>=3) {
                minPrevCost=Math.min(minPrevCost, cache[i-3]+9);
            }
            cache[i]=lanCost+minPrevCost;
        }
        return (int)cache[n];
    }
}