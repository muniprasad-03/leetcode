// Last updated: 04/04/2026, 23:31:23
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            int j;
            for(j=i+1;j<n;j++) {
                if(prices[j] <= prices[i]) break;
            }
            if(j==n) ans[i] = prices[i];
            else ans[i] = prices[i]-prices[j];
        }
        return ans;
    }
}