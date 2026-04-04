// Last updated: 04/04/2026, 23:32:09
class Solution {
    int m, n;
    private void bfs(int row, int col, int[][] grid, boolean[][] vis) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        vis[row][col] = true;
        int[] rowChange = new int[]{-1, 0, 1, 0};
        int[] colChange = new int[]{0, -1, 0, 1};
        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            for(int i=0;i<4;i++) {
                int r = node[0]+rowChange[i];
                int c = node[1]+colChange[i];
                if(r>=0 && c>=0 && r<m && c<n && grid[r][c] == 1 && !vis[r][c]) {
                    vis[r][c] = true;
                    queue.add(new int[]{r, c});
                }
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++) {
            if(grid[i][0] == 1 && !vis[i][0]) {
                bfs(i, 0, grid, vis);
            }
            if(grid[i][n-1] == 1 && !vis[i][n-1]) {
                bfs(i, n-1, grid, vis);
            }
        }
        for(int i=0;i<n;i++) {
            if(grid[0][i] == 1 && !vis[0][i]) {
                bfs(0, i, grid, vis);
            }
            if(grid[m-1][i] == 1 && !vis[m-1][i]) {
                bfs(m-1, i, grid, vis);
            }
        }
        int ans = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(vis[i][j] == false && grid[i][j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}