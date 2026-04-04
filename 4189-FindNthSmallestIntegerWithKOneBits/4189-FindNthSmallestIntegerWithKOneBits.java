// Last updated: 04/04/2026, 23:26:36
class Solution {
    public long nthSmallest(long n, int k) {
        long result = 0;
        int remainingOnes = k;
        for (int i = 60;i >= 0;i--) {
            if (remainingOnes == 0) break;
            long count = combinations(i,remainingOnes);

            if (n>count) {
                result |= (1L<<i);
                n -= count;
                remainingOnes--;
            }
        }
        return result;
    }
    private long combinations(int n, int r) {
        if (r<0 || r>n) return 0;
        if (r == 0 || r == n) return 1;
        if (r>n / 2) r = n-r;
        long res = 1;
        for (int i = 1;i<=r;i++) {
            res = res * (n-i+1) / i;
        }
        return res;
    }
}