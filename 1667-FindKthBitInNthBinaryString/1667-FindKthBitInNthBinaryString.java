// Last updated: 04/04/2026, 23:31:13
class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1) return '0';
        int length = (1 << n) - 1;
        int mid = length/2 +1;
        if(k < mid) {
            return findKthBit(n-1, k);
        } else if(k == mid) {
            return '1';
        } else {
            char bit = findKthBit(n-1, length-k+1);
            return bit == '1' ? '0' : '1';
        }
    }
}