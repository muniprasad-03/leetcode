// Last updated: 20/04/2026, 22:54:57
1class Solution {
2    public int maxDistance(int[] colors) {
3        int ans = 0;
4        int n = colors.length;
5        for(int i=0;i<n;i++) {
6            for(int j=0;j<n;j++) {
7                if(colors[i] != colors[j]) {
8                    ans = Math.max(ans, Math.abs(i - j));
9                }
10            }
11        }
12        return ans;
13    }
14}