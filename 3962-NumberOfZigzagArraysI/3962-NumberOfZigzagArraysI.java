// Last updated: 04/04/2026, 23:28:33
class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int MOD=1000000007;
        long[][] cacheUp=new long[n+1][r+2];
        long[][] cacheDown=new long[n+1][r+2];
        for(int j=l;j<=r;j++) {
            cacheUp[2][j]=j-l;
            cacheDown[2][j]=r-j;
        }
        for(int i=3;i<=n;i++) {
            long[] prefixSumDown=new long[r+2];
            for(int k=l;k<=r;k++) {
                prefixSumDown[k]=(prefixSumDown[k-1]+cacheDown[i-1][k])%MOD;
            }
            long[] suffSumUp=new long[r+2];
            for(int k=r;k>=l;k--) {
                suffSumUp[k]=(suffSumUp[k+1]+cacheUp[i-1][k])%MOD;
            }
            for(int j=l;j<=r;j++) {
                cacheUp[i][j]=prefixSumDown[j-1];
                cacheDown[i][j]=suffSumUp[j+1];
            }
        }
        long result=0;
        for(int j=l;j<=r;j++) {
            result = (result+cacheUp[n][j])%MOD;
            result = (result+cacheDown[n][j])%MOD;
        }
        return (int)result;
    }
}