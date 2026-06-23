class Solution {
    public int zigZagArrays(int n, int l, int r) {
        long MOD = 1_000_000_007L;
        int m = r - l + 1;
        if(n == 1) {
            return m;
        }
        long[][] dp = new long[m][2];
        for(int v = 0; v < m; ++v) {
            dp[v][0] = v; 
            dp[v][1] = (m - 1 - v);
        }
        for(int i = 2; i < n; ++i) {
            long[][] nextDp = new long[m][2];
            long[] pref0 = new long[m + 1];
            long[] pref1 = new long[m + 1];
            for(int v = 0; v < m; ++v) {
                pref0[v + 1] =(pref0[v] + dp[v][0]) % MOD;
                pref1[v + 1] =(pref1[v] + dp[v][1]) % MOD;
            }
            for(int v = 0; v < m; ++v) {
                nextDp[v][0] = pref1[v]; 
                nextDp[v][1] =(pref0[m] - pref0[v + 1] + MOD) % MOD;
            }
            dp = nextDp;
        }
        long ans = 0;
        for(int v = 0; v < m; ++v) {
            ans =(ans + dp[v][0] + dp[v][1]) % MOD;
        }
        return (int) ans;
    }
}