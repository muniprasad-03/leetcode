// Last updated: 16/04/2026, 22:27:49
1class Solution {
2    Boolean[][] memo = null;
3    public boolean solve(int i, int j, String s, String p) {
4        if(i == -1 && j == -1) return true;
5        if(i >= 0 && j < 0) return false;
6        if(i < 0 && j >= 0) {
7            for(int x=j; x>=0; x--) {
8                if(p.charAt(x) != '*') return false;
9            }
10            return true;
11        }
12        
13        if(memo[i][j] != null) return memo[i][j];
14
15        if((s.charAt(i) == p.charAt(j)) || (p.charAt(j) == '?')) {
16            return memo[i][j] = solve(i-1, j-1, s, p);
17        } else if(p.charAt(j) == '*') {
18            return memo[i][j] = solve(i-1, j, s, p) || solve(i, j-1, s, p);
19        }
20        return memo[i][j] = false;
21    }
22    public boolean isMatch(String s, String p) {
23        int n = s.length();
24        int m = p.length();
25        memo = new Boolean[n][m];
26        return solve(n-1, m-1, s, p);
27    }
28}