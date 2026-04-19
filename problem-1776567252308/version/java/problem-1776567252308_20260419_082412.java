// Last updated: 19/04/2026, 08:24:12
1class Solution {
2    public int[][] colorGrid(int n, int m, int[][] sources) {
3        int[][] grid = new int[n][m];
4        int[][] time = new int[n][m];
5        for(int[] row : time) {
6            Arrays.fill(row, Integer.MAX_VALUE);
7        }
8        
9        Queue<int[]> queue = new LinkedList<>();
10        Arrays.sort(sources,(a, b) -> b[2]-a[2]);
11        for(int[] s : sources) {
12            int r = s[0], c = s[1], val = s[2];
13            grid[r][c] = val;
14            time[r][c] = 0;
15            queue.offer(new int[]{r, c, val, 0});
16        }
17        
18        int[] dr = {0, 0, 1, -1};
19        int[] dc = {1, -1, 0, 0};
20        while(!queue.isEmpty()) {
21            int[] curr = queue.poll();
22            int r = curr[0], c = curr[1], val = curr[2], t = curr[3];
23            if(t > time[r][c]) continue;
24            for(int i = 0; i < 4; i++) {
25                int nr = r+dr[i];
26                int nc = c+dc[i];
27                int nt = t+1;
28                if(nr >= 0 && nr < n && nc >= 0 && nc < m) {
29                    if(nt < time[nr][nc]) {
30                        time[nr][nc] = nt;
31                        grid[nr][nc] = val;
32                        queue.offer(new int[]{nr, nc, val, nt});
33                    } else if(nt == time[nr][nc] && val > grid[nr][nc]) {
34                        grid[nr][nc] = val;
35                    }
36                }
37            }
38        }
39        return grid;
40    }
41}