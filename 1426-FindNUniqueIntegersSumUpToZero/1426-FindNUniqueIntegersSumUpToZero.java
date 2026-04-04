// Last updated: 04/04/2026, 23:31:42
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0;
        if(n%2==1) ans[idx++] = 0;
        int half = n/2;
        for(int i=1;i<=half;i++) {
            ans[idx++] = i;
            ans[idx++] = -i;
        }
        return ans;
    }
}