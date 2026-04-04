// Last updated: 04/04/2026, 23:28:27
class Solution {
    long hv;
    private long compute(int[] startA,int[] durA,int[] startB,int[] durB) {
        int n = startA.length;
        int m = startB.length;
        long[][] a = new long[n][2];
        for(int i=0;i<n;i++) {
            a[i][0] = (long)startA[i] + durA[i];
            a[i][1] = durA[i];
        }
        long[][] b = new long[m][2];
        for(int i=0;i<m;i++) {
            b[i][0] = startB[i];
            b[i][1] = durB[i];
        }
        Arrays.sort(a,Comparator.comparingLong(r->r[0]));
        Arrays.sort(b,Comparator.comparingLong(r->r[0]));
        long[] suf = new long[m+1];
        suf[m] = Long.MAX_VALUE;
        for(int i=m-1;i>=0;i--) {
            suf[i]=Math.min(suf[i+1],b[i][0]+b[i][1]);
        }
        long res = Long.MAX_VALUE;
        long pre = Long.MAX_VALUE;
        int ptrB = 0;
        for(int i=0;i<n;i++) {
            long fA = a[i][0];
            this.hv = fA;
            while(ptrB<m && b[ptrB][0] <=fA) {
                pre = Math.min(pre,b[ptrB][1]);
                ptrB++;
            }
            if(pre!=Long.MAX_VALUE) {
                res = Math.min(res,fA+pre);
            }
            if(ptrB<m) {
                res = Math.min(res,suf[ptrB]);
            }
        }
        return res;
    }
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        long t1 = compute(landStartTime,landDuration,waterStartTime,waterDuration);
        long t2 = compute(waterStartTime,waterDuration,landStartTime,landDuration);
        return (int)Math.min(t1,t2);
    }
}