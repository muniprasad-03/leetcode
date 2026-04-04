// Last updated: 04/04/2026, 23:36:07
class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for(int i=0;i<32;i++) {
            ans = ans << 1;
            ans = ans | (n & 1);
            n = n >>1;
        }
        return ans;
    }
}