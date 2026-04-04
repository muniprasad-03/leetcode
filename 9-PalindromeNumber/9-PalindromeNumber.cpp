// Last updated: 04/04/2026, 23:39:07
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        int temp=x;
        int rem=0,sum=0;
        while(temp>0)
        {
            rem=temp%10;
            if(INT_MAX/10>sum)
            sum=(sum*10)+rem;
            else return false;
            temp=temp/10;
        }
        if(x==sum) return true;
        else return false;
    }
};