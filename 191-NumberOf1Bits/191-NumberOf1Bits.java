// Last updated: 04/04/2026, 23:36:06
class Solution {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n>0) {
            ans += (n & 1);
            n >>= 1;
        }
        return ans;
    }
}