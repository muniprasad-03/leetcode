// Last updated: 04/04/2026, 23:29:13
class Solution {
    public int minChanges(int n, int k) {
        if ((n&k) != k) {
            return -1;
        }
        return Integer.bitCount(n^k);
    }
}