// Last updated: 04/04/2026, 23:36:55
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++) {
            min = Math.min(min, prices[i]);
            if(prices[i]-min > 0) {
                ans += (prices[i]-min);
                min = prices[i];
            }
        }
        return ans;
    }
}