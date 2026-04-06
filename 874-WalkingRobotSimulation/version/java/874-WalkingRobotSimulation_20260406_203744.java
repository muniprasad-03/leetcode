// Last updated: 06/04/2026, 20:37:44
1class Solution {
2    public int robotSim(int[] commands, int[][] obstacles) {
3        Set<String> set = new HashSet<>();
4        for(int[] obs : obstacles) {
5            set.add(obs[0]+","+obs[1]);
6        }
7        int[][] dirs = new int[][]{
8            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
9        };
10        int x = 0;
11        int y = 0;
12        int curr = 0;
13        int ans = 0;
14        for(int cmd : commands) {
15            if(cmd == -1) {
16                curr = (curr + 1) % 4;
17            } else if(cmd == -2) {
18                curr = (curr + 3) % 4;
19            } else {
20                for(int i=0;i<cmd;i++) {
21                    int newX = dirs[curr][0] + x;
22                    int newY = dirs[curr][1] + y;
23                    if(set.contains(newX+","+newY)) {
24                        break;
25                    }
26                    x = newX;
27                    y = newY;
28                }
29            }
30            ans = Math.max(ans, x*x + y*y);
31        }
32        return ans;
33    }
34}