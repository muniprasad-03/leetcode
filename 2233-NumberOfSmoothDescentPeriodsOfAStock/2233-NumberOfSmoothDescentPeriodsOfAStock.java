// Last updated: 04/04/2026, 23:30:29
class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long start=0,total=1;
        for(int j=1;j<n;j++) {
            if (prices[j-1]-prices[j]!=1) start=j;
            total+=j-start + 1;
        }
        return total;
    }
}
