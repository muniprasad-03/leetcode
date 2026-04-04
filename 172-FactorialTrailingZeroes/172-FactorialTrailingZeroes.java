// Last updated: 04/04/2026, 23:36:11
class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n>0) {
            n/=5;
            ans += n;
        }
        return ans;
    }
}