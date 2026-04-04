// Last updated: 04/04/2026, 23:26:09
class Solution {
    private static final int MOD = 1000000007;
    public int countVisiblePeople(int n, int pos, int k) {
        if (k > n-1) return 0;
        long[] fact = new long[n];
        long[] invFact = new long[n];
        fact[0] = 1;
        invFact[0] = 1;
        for (int i = 1;i < n;i++) {
            fact[i] = (fact[i-1]*i) % MOD;
        }
        invFact[n-1] = power(fact[n-1], MOD-2);
        for (int i = n-2;i >= 1;i--) {
            invFact[i] = (invFact[i+1]*(i+1)) % MOD;
        }
        long nCr = (((fact[n-1]*invFact[k]) % MOD) * invFact[n-1-k]) % MOD;
        return (int)((nCr*2) % MOD);
    }

    private long power(long base, long exp) {
        long res = 1;
        base  %= MOD;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res*base) % MOD;
            base = (base*base) % MOD;
            exp /= 2;
        }
        return res;
    }
}