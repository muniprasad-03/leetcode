// Last updated: 04/04/2026, 23:35:31
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0) && ((n & (n-1)) == 0);
    }
}