// Last updated: 04/04/2026, 23:29:26
class Solution {
    private int[][][] cache = new int[201][201][2];
    private int MOD = 1000000007;
    private int help(int zeros, int ones, int lim, int ch) {
        if(ones == 0 && zeros == 0) return 1;
        if(cache[zeros][ones][ch] != -1) return cache[zeros][ones][ch];
        int res = 0;
        if(ch == 1) {
            for(int len = 1; len <= Math.min(lim, ones); len++) {
                res = (res + help(zeros, ones-len, lim, 0)) % MOD;
            }
        } else {
            for(int len = 1; len <= Math.min(lim, zeros); len++) {
                res = (res + help(zeros-len, ones, lim, 1)) % MOD;
            }
        }
        return cache[zeros][ones][ch] = res;
    }
    public int numberOfStableArrays(int zero, int one, int limit) {
        for(int[][] grid : cache) {
            for(int[] row : grid) {
                Arrays.fill(row, -1);
            }
        }
        return (help(zero, one, limit, 0) + help(zero, one, limit, 1)) % MOD;
    }
}