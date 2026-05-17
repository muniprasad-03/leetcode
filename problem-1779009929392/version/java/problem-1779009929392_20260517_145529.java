// Last updated: 17/05/2026, 14:55:29
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        if(k == 1) {
4            return r-l+1;
5        }
6        int high = (int) Math.pow(r, 1.0/k);
7        while(Math.pow(high+1, k) <= r) {
8            high++;
9        }
10        while(Math.pow(high, k) > r) {
11            high--;
12        }
13        int low = (int) Math.pow(l, 1.0/k);
14        while(Math.pow(low, k) < l) {
15            low++;
16        }
17        while(low > 0 && Math.pow(low-1, k) >= l) {
18            low--;
19        }
20        if(low <= high) {
21            return high-low+1;
22        }
23        return 0;
24    }
25}