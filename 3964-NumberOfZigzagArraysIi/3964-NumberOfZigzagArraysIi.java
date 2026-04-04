// Last updated: 04/04/2026, 23:28:32
class Solution {
    long MOD=1000000007;
    private long[][] multiply(long[][] A,long[][] B,int size) {
        long[][] C=new long[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                for(int k=0;k<size;k++) {
                    C[i][j]=(C[i][j]+A[i][k]*B[k][j])%MOD;
                }
            }
        }
        return C;
    }
    private long[][] power(long[][] A,long exp,int size) {
        long[][] res = new long[size][size];
        for(int i=0;i<size;i++) {
            res[i][i]=1;
        }
        while(exp>0) {
            if(exp%2==1) {
                res=multiply(res,A,size);
            }
            A=multiply(A,A,size);
            exp/=2;
        }
        return res;
    }
    public int zigZagArrays(int n, int l, int r) {
        int m=r-l+1;
        int size=2*m;
        long[] s2=new long[size];
        for(int j=0;j<m;j++) {
            s2[j]=j;
            s2[j+m]=m-1-j;
        }
        long[][] T = new long[size][size];
        for(int j=0;j<m;j++) {
            for(int k=0;k<j;k++) {
                T[j][m+k]=1;
            }
            for(int k=j+1;k<m;k++) {
                T[j+m][k]=1;
            }
        }
        if(n==2) {
            long total=0;
            for(long cnt : s2) {
                total=(total+cnt)%MOD;
            }
            return (int)total;
        }
        long[][] tPow=power(T,n-2,size);
        long[] sN=new long[size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                sN[i]=(sN[i]+tPow[i][j]*s2[j])%MOD;
            }
        }
        long totCnt=0;
        for(long cnt : sN) {
            totCnt=(totCnt+cnt)%MOD;
        }
        return (int)totCnt;
    }
}