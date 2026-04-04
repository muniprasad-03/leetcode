// Last updated: 04/04/2026, 23:32:03
class Solution {
    public int tribonacci(int n) {
        if(n <= 1) return n;
        if(n == 2) return 1;
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        for(int i=3;i<=n;i++) {
            int t3 = t2 + t1 + t0;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        return t2;
    }
}