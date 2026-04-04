// Last updated: 04/04/2026, 23:30:49
class Solution {
    public final long MOD = 1000000007;
    public long binExp(long base,long pow) {
        long ans = 1;
        while(pow >= 1) {
            if(pow%2==0) {
                base = (base * base) % MOD;
                pow = pow>>1; // same as pow = pow/2
            } else {
                ans = (ans * base) % MOD;
                pow--;
            }
        }
        return ans;
    }                                               
    public int countGoodNumbers(long n) {
        return (int)((binExp(5,(n+1)/2)%MOD*binExp(4,n/2)%MOD)%MOD);
    }
}