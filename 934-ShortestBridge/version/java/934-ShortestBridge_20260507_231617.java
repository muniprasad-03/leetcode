// Last updated: 07/05/2026, 23:16:17
1class Solution {
2    int[][] dirs = new int[][] {
3        {-1, 0}, {0, -1}, {1, 0}, {0, 1}
4    };
5    public int shortestBridge(int[][] grid) {
6        int n = grid[0].length;
7        Queue<int[]> queue1 = new LinkedList<>();
8        Queue<int[]> queue2 = new LinkedList<>();
9        boolean b = false;
10        for(int i=0;i<n;i++) {
11            for(int j=0;j<n;j++) {
12                if(grid[i][j] == 1) {
13                    grid[i][j] = -1;
14                    queue1.offer(new int[]{i, j});
15                    while(!queue1.isEmpty()) {
16                        int[] curr = queue1.poll();
17                        queue2.offer(curr);
18                        for(int d=0;d<4;d++) {
19                            int nr = curr[0] + dirs[d][0];
20                            int nc = curr[1] + dirs[d][1];
21                            if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==1) {
22                                grid[nr][nc] = -1;
23                                queue1.offer(new int[]{nr, nc});
24                            }
25                        }
26                    }
27                    b = true;
28                    break;
29                }
30            }
31            if(b) break;
32        }
33        int distance = 0;
34        while(!queue2.isEmpty()) {
35            int size = queue2.size();
36            for(int i=0;i<size;i++) {
37                int[] curr = queue2.poll();
38                for(int d=0;d<4;d++) {
39                    int nr = curr[0] + dirs[d][0];
40                    int nc = curr[1] + dirs[d][1];
41                    if(nr>=0 && nc>=0 && nr<n && nc<n) {
42                        if(grid[nr][nc] == 1) {
43                            return distance;
44                        } else if(grid[nr][nc] == 0) {
45                            grid[nr][nc] = -1;
46                            queue2.offer(new int[]{nr, nc});
47                        }
48                    }
49                }
50            }
51            distance++;
52        }
53        return distance;
54    }
55}