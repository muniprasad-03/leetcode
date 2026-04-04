// Last updated: 04/04/2026, 23:27:08
class Solution {
    public long minCost(String s, int[] cost) {
        int n=s.length();
        long total = 0;
        long[] sums = new long[26];
        for(int i=0;i<n;i++) {
            int idx=s.charAt(i)-'a';
            total += cost[i];
            sums[idx] += cost[i];
        }
        long minCost = Long.MAX_VALUE;
        for(int i=0;i<26;i++) {
            if(sums[i]>0) {
                minCost = Math.min(minCost, total-sums[i]);
            }
        }
        return minCost;
    }
}