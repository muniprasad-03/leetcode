// Last updated: 04/05/2026, 23:31:19
class Solution {
    int n, p;
    int[] a, seg;
    public int countGoodSubseq(int[] nums, int p, int[][] queries) {
        this.n = nums.length;
        this.p = p;
        a = nums.clone();
        if(n <= 6) {
            int ans = 0;
            for(int[] q : queries) {
                a[q[0]] = q[1];
                if(checkSmall()) ans++;
            }
            return ans;
        }

        seg = new int[4*n];
        build(1, 0, n-1);
        int ans = 0;
        for(int[] q : queries) {
            update(1, 0, n-1, q[0], q[1]);
            a[q[0]] = q[1];
            if(seg[1] == p) ans++;
        }
        return ans;
    }
    boolean checkSmall() {
        int lim = 1 << n;
        for(int mask = 1; mask < lim-1; mask++) {
            int g = 0;
            for(int i = 0; i < n; i++) {
                if((mask &(1 << i)) != 0) {
                    g =(g == 0) ? a[i] : gcd(g, a[i]);
                }
            }
            if(g == p) return true;
        }
        return false;
    }
    void build(int idx, int l, int r) {
        if(l == r) {
            seg[idx] =(a[l]%p == 0) ? a[l] : 0;
            return;
        }
        int m =(l+r) >> 1;
        build(idx << 1, l, m);
        build(idx << 1 | 1, m+1, r);
        seg[idx] = gcd(seg[idx << 1], seg[idx << 1 | 1]);
    }
    void update(int idx, int l, int r, int pos, int val) {
        if(l == r) {
            seg[idx] =(val%p == 0) ? val : 0;
            return;
        }
        int m =(l+r) >> 1;
        if(pos <= m) update(idx << 1, l, m, pos, val);
        else update(idx << 1 | 1, m+1, r, pos, val);
        seg[idx] = gcd(seg[idx << 1], seg[idx << 1 | 1]);
    }
    int gcd(int x, int y) {
        while(y != 0) {
            int t = x%y;
            x = y;
            y = t;
        }
        return x;
    }
}