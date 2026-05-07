// Last updated: 07/05/2026, 23:28:53
1class Solution {
2    private final int[] dirs = {-1, 0, 1, 0, -1};
3    int n;
4    int[][] grid;
5    Queue<int[]> q = new LinkedList<>();
6    public int shortestBridge(int[][] grid) {
7        this.grid = grid;
8        this.n = grid.length;
9        boolean found = false;
10        for(int i=0;i<n && !found;i++) {
11            for(int j=0;j<n && !found;j++) {
12                if(grid[i][j] == 1) {
13                    dfs(i, j);
14                    found = true;
15                }
16            }
17        }
18        int dist = 0;
19        while(!q.isEmpty()) {
20            int size = q.size();
21            while(size-- > 0) {
22                int[] curr = q.poll();
23                int r = curr[0];
24                int c = curr[1];
25                for(int i=0;i<4;i++) {
26                    int nr = r+dirs[i];
27                    int nc = c+dirs[i+1];
28                    if(nr>=0 && nr<n && nc>=0 && nc<n) {
29                        if(grid[nr][nc] == 1) {
30                            return dist;
31                        }
32                        if(grid[nr][nc] == 0) {
33                            grid[nr][nc] = -1;
34                            q.offer(new int[]{nr, nc});
35                        }
36                    }
37                }
38            }
39            dist++;
40        }
41        return dist;
42    }
43    private void dfs(int r, int c) {
44        if(r<0 || r>=n || c<0 || c>=n || grid[r][c] != 1) {
45            return;
46        }
47        grid[r][c] = -1;
48        q.offer(new int[]{r, c});
49        for(int i=0;i<4;i++) {
50            dfs(r+dirs[i], c+dirs[i+1]);
51        }
52    }
53}