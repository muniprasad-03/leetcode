// Last updated: 12/04/2026, 09:04:33
1class Solution {
2    int n, p;
3    int[] a, seg;
4    public int countGoodSubseq(int[] nums, int p, int[][] queries) {
5        this.n = nums.length;
6        this.p = p;
7        a = nums.clone();
8        if(n <= 6) {
9            int ans = 0;
10            for(int[] q : queries) {
11                a[q[0]] = q[1];
12                if(checkSmall()) ans++;
13            }
14            return ans;
15        }
16
17        seg = new int[4*n];
18        build(1, 0, n-1);
19        int ans = 0;
20        for(int[] q : queries) {
21            update(1, 0, n-1, q[0], q[1]);
22            a[q[0]] = q[1];
23            if(seg[1] == p) ans++;
24        }
25        return ans;
26    }
27    boolean checkSmall() {
28        int lim = 1 << n;
29        for(int mask = 1; mask < lim-1; mask++) {
30            int g = 0;
31            for(int i = 0; i < n; i++) {
32                if((mask &(1 << i)) != 0) {
33                    g =(g == 0) ? a[i] : gcd(g, a[i]);
34                }
35            }
36            if(g == p) return true;
37        }
38        return false;
39    }
40    void build(int idx, int l, int r) {
41        if(l == r) {
42            seg[idx] =(a[l]%p == 0) ? a[l] : 0;
43            return;
44        }
45        int m =(l+r) >> 1;
46        build(idx << 1, l, m);
47        build(idx << 1 | 1, m+1, r);
48        seg[idx] = gcd(seg[idx << 1], seg[idx << 1 | 1]);
49    }
50    void update(int idx, int l, int r, int pos, int val) {
51        if(l == r) {
52            seg[idx] =(val%p == 0) ? val : 0;
53            return;
54        }
55        int m =(l+r) >> 1;
56        if(pos <= m) update(idx << 1, l, m, pos, val);
57        else update(idx << 1 | 1, m+1, r, pos, val);
58        seg[idx] = gcd(seg[idx << 1], seg[idx << 1 | 1]);
59    }
60    int gcd(int x, int y) {
61        while(y != 0) {
62            int t = x%y;
63            x = y;
64            y = t;
65        }
66        return x;
67    }
68}