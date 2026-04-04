// Last updated: 04/04/2026, 23:30:22
class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=(start ^ goal);
        int count=0;
        while(xor != 0) {
            count = count + (xor & 1);
            xor = xor>>1;
        }
        return count;
    }
}