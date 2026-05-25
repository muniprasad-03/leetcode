// Last updated: 25/05/2026, 16:59:16
1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n = s.length();
4        Queue<Integer> queue = new LinkedList<>();
5        queue.offer(0);
6        boolean[] vis = new boolean[n];
7        vis[0] = true;
8        int farthest = 0;
9        while(!queue.isEmpty()) {
10            int curr = queue.poll();
11            if(curr == n - 1) return true;
12            int start = Math.max(curr + minJump, farthest + 1);
13            int end = Math.min(curr + maxJump, n - 1);
14            for(int j = start; j <= end; j++) {
15                if(s.charAt(j) == '0' && !vis[j]) {
16                    vis[j] = true;
17                    queue.offer(j);
18                }
19            }
20            farthest = end;
21        }
22        return false;
23    }
24}