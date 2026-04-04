// Last updated: 04/04/2026, 23:33:26
class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastBit = ((n&1) == 1) ? 1 : 0;
        n = n>>1;
        while(n>0) {
            int lastSecondBit =  ((n&1) == 1) ? 1 : 0;
            n = n>>1;
            if(lastBit == lastSecondBit) return false;
            lastBit = lastSecondBit;
        }
        return true;
    }
}