// Last updated: 04/04/2026, 23:26:10
class Solution {
    public long countCommas(long n) {
        if(n < 1000) return 0;
        long threshold = 1000L;
        long ans = 0;
        while(threshold <= n) {
            ans += (n - threshold + 1);
            if(threshold > n/1000) break;
            threshold *= 1000;
        }
        return ans;
    }
}