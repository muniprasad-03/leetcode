// Last updated: 04/04/2026, 23:38:15
class Solution {
    public double myPow(double x, int n) {
        long pow = (n<0) ? (long)n*-1: (long)n;
        double ans = 1.0;
        while(pow>=1) {
            if(pow%2==0) {
                x*=x;
                pow/=2;
            } else {
                ans*=x;
                pow-=1;
            }
        }
        return (n<0 ? (1/ans) : ans) ;
    }
}