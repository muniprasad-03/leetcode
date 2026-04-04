// Last updated: 04/04/2026, 23:32:15
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int temp = n;
        int count = 0;
        while(temp > 0) {
            count++;
            temp >>= 1;
        }
        int mask = (1 << count) -1;
        return mask ^ n;
    }
}