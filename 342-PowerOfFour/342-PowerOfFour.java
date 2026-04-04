// Last updated: 04/04/2026, 23:34:54
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        while(n%4==0 && n>=4) {
            n/=4;
        }
        return n==1;
    }
}