// Last updated: 04/04/2026, 23:30:00
class Solution {
    public int alternateDigitSum(int n) {
        int len=0;
        int temp=n;
        while(temp!=0) {
            len++;
            temp/=10;
        }
        boolean sign = (len%2==0)?false:true;
        int ans=0;
        temp=n;
        while(temp!=0) {
            if(sign) ans+=(temp%10);
            else ans-=(temp%10);
            temp/=10;
            sign=!sign;
        }
        return ans;
    }
}