// Last updated: 04/04/2026, 23:39:08
class Solution {
public:
    int reverse(int x) {
        int rem=0,sum=0;
        while(x!=0)
        {
            rem=x%10;
            if(INT_MAX/10<sum || INT_MIN/10>sum) return 0;
            sum=sum*10+rem;
            x=x/10;
        }
        return sum;
    }
};