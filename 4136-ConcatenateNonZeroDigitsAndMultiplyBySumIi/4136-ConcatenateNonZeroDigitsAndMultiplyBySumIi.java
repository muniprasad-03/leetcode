// Last updated: 04/04/2026, 23:27:11
class Solution {
    static final int MOD=1000000007;
    public int[] sumAndMultiply(String s, int[][] qrs) {
        int n=s.length();
        int q=qrs.length;
        long[] sum=new long[n+1];
        long[] val=new long[n+1];
        int[] cnt=new int[n+1];
        long[] pow0f10=new long[n+1];
        pow0f10[0]=1;
        for (int i=1;i<=n;i++) {
            pow0f10[i]=(pow0f10[i-1]*10)%MOD;
        }
        for (int i=0;i<n;i++) {
            char c=s.charAt(i);
            val[i+1]=val[i];
            sum[i+1]=sum[i];
            cnt[i+1]=cnt[i];
            if (c!='0') {
                int d=c-'0';
                val[i+1]=(val[i+1]*10+d)%MOD;
                sum[i+1]=(sum[i+1]+d)%MOD;
                cnt[i+1]++;
            }
        }
        int[] ans=new int[q];
        for (int i=0;i<q;i++) {
            int l=qrs[i][0], r=qrs[i][1];
            int c=cnt[r+1]-cnt[l];
            if (c==0) {
                ans[i]=0;
                continue;
            }
            long sm=(sum[r+1]-sum[l]+MOD)%MOD;
            long x=(val[r+1]-(val[l]*pow0f10[c])%MOD+MOD)%MOD;
            ans[i]=(int) ((x*sm)%MOD);
        }
        return ans;
    }
}
