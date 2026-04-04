// Last updated: 04/04/2026, 23:31:07
class Solution {
    public int concatenatedBinary(int n) {
        long ans = 0;
        int mod = 1000000007;
        for(int i=1;i<=n;i++) {
            int len = Integer.SIZE - Integer.numberOfLeadingZeros(i);
            ans = ((ans << len) | i) % mod;
        }
        return (int)ans;
    }
}