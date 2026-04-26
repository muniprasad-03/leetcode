// Last updated: 26/04/2026, 11:37:08
1class Solution {
2    private char[][] grid;
3    private boolean[][] vis;
4    private int m, n;
5    private int[][] deltaDir = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
6    private boolean dfs(int row, int col, int parRow, int parCol, char ch) {
7        vis[row][col] = true;
8        for(int i=0;i<4;i++) {
9            int r = row + deltaDir[i][0];
10            int c = col + deltaDir[i][1];
11            if(r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == ch) {
12                if(!vis[r][c]) {
13                    if(dfs(r, c, row, col, ch)) {
14                        return true;
15                    } 
16                } else if(r != parRow || c != parCol){
17                    return true;
18                }
19            } 
20        }
21        return false;
22    }
23    public boolean containsCycle(char[][] grid) {
24        this.grid = grid;
25        this.m = grid.length;
26        this.n = grid[0].length;
27        vis = new boolean[m][n];
28        for(int i=0;i<m;i++) {
29            for(int j=0;j<n;j++) {
30                if(!vis[i][j] && dfs(i, j, -1, -1, grid[i][j])) {
31                    return true;
32                }
33            }
34        }
35        return false;
36    }
37}