// Last updated: 04/04/2026, 23:34:57
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++) {
            int num = i;
            int cnt = 0;
            while(num != 0) {
                cnt += (num & 1);
                num >>= 1;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}