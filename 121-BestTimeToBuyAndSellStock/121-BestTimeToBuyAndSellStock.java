// Last updated: 04/04/2026, 23:36:56
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for(int i=1;i<prices.length;i++) {
            if(min > prices[i]) min = prices[i];
            else if(prices[i]-min > ans) ans = prices[i]-min;
        }
        return ans;
    }
}