// Last updated: 04/04/2026, 23:38:20
class Solution {
public:
    double myPow(double x, int n) {
        if(n==0) return 1;
        long long pow=n;
        if(n<0)
        {
            pow=pow*(-1);
        }
        double ans=1;
        while(pow>0)
        {
            if(pow%2==0)
            {
                x=x*x;
                pow=pow/2;
            }
            else
            {
                ans=ans*x;
                pow=pow-1;
            }
        }
        if(n<0) return 1.0/ans;
        return ans;
    }
};