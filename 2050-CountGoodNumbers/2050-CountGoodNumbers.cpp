// Last updated: 04/04/2026, 23:30:46
class Solution {
public:
    const long long MOD=1000000007;
    long long binExp(long long base,long long pow) {
        if(pow==0) return 1;
        long long ans = binExp(base,pow/2);
        ans = (ans*ans)%MOD;
        if(pow%2!=0) ans = (ans*base)%MOD;
        return ans;
    }
    int countGoodNumbers(long long n) {
        long long even = n/2+(n%2);
        long long odd = n/2;
        return (int)((binExp(5,even)*binExp(4,odd))%MOD);
    }
};
