// Last updated: 04/04/2026, 23:37:59
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int i = 1;
        int j = x;
        int ans = 0;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            long sq = (long) mid * mid;

            if (sq <= x) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return ans;
    }
}
