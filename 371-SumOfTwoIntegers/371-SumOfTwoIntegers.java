// Last updated: 04/04/2026, 23:34:44
class Solution {
    public int getSum(int a, int b) {
        while(b!=0) {
            int carry = a & b ;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}