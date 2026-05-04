// Last updated: 04/05/2026, 23:30:51
class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] grid = new int[n][m];
        int[][] time = new int[n][m];
        for(int[] row : time) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        Arrays.sort(sources,(a, b) -> b[2]-a[2]);
        for(int[] s : sources) {
            int r = s[0], c = s[1], val = s[2];
            grid[r][c] = val;
            time[r][c] = 0;
            queue.offer(new int[]{r, c, val, 0});
        }
        
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], val = curr[2], t = curr[3];
            if(t > time[r][c]) continue;
            for(int i = 0; i < 4; i++) {
                int nr = r+dr[i];
                int nc = c+dc[i];
                int nt = t+1;
                if(nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if(nt < time[nr][nc]) {
                        time[nr][nc] = nt;
                        grid[nr][nc] = val;
                        queue.offer(new int[]{nr, nc, val, nt});
                    } else if(nt == time[nr][nc] && val > grid[nr][nc]) {
                        grid[nr][nc] = val;
                    }
                }
            }
        }
        return grid;
    }
}