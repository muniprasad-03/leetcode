// Last updated: 04/04/2026, 23:26:13
class Solution {
    public int countCommas(int n) {
        if(n < 999) return 0;
        return n - 1000 + 1;
    }
}