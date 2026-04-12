// Last updated: 12/04/2026, 08:04:16
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int n = matrix.length;
4        int[] ans = new int[n];
5        for(int i=0;i<n;i++) {
6            int cnt = 0;
7            for(int j=0; j<n; j++) {
8                if(matrix[i][j] == 1) {
9                    cnt++;
10                }
11            }
12            ans[i] = cnt;
13        }
14        return ans;
15    }
16}