// Last updated: 23/05/2026, 21:26:08
1class Solution{
2    public int maxScore(int[][] grid){
3        int m = grid.length;
4        int n = grid[0].length;
5        long ans = Long.MIN_VALUE;
6        for(int i = 1;i+1<m;i++){
7            for(int j = 1;j+1<n;j++){
8                ans = Math.max(ans, grid[i][j]);
9            }
10        }
11        long[] pref = new long[n+1];
12        for(int i = 0;i<m;i++){
13            pref[0] = 0;
14            for(int j = 0;j<n;j++){
15                pref[j+1] = pref[j]+grid[i][j];
16            }
17            long minPref = 0;
18            for(int r = 1;r<n;r++){
19                minPref = Math.min(minPref, pref[r-1]);
20                ans = Math.max(ans, pref[r+1]-minPref);
21            }
22        }
23        long[] colPref = new long[m+1];
24        for(int j = 0;j<n;j++){
25            colPref[0] = 0;
26            for(int i = 0;i<m;i++){
27                colPref[i+1] = colPref[i]+grid[i][j];
28            }
29            long minPref = 0;
30            for(int r = 1;r<m;r++){
31                minPref = Math.min(minPref, colPref[r-1]);
32                ans = Math.max(ans, colPref[r+1]-minPref);
33            }
34        }
35        return (int)ans;
36    }
37}