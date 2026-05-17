// Last updated: 17/05/2026, 22:22:25
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        int start = (int) Math.ceil(Math.pow(l, 1.0/k) - 1e-9);
4        int end = (int) Math.floor(Math.pow(r, 1.0/k) + 1e-9);
5        return (end >= start) ? end - start + 1 : 0;
6    }
7}