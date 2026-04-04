// Last updated: 04/04/2026, 23:32:45
class Solution {
    public int binaryGap(int num) {
        int ans = 0;
        int dist = -32;
        while(num > 0) {
            if((num&1) == 1) {
                ans = Math.max(ans, dist);
                dist = 1;
            } else {
                dist++;
            }
            num = num >> 1;
        }
        return ans;
    }
}