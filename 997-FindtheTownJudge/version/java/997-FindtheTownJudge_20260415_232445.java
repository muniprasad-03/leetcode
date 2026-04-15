// Last updated: 15/04/2026, 23:24:45
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        List<List<Integer>> adj = new ArrayList<>(n+1);
4        int[] indegree = new int[n+1];
5        for(int i=0;i<=n;i++) {
6            adj.add(new ArrayList<>());
7        }
8        for(int[] t : trust) {
9            int a = t[0];
10            int b = t[1];
11            adj.get(a).add(b);
12            indegree[b]++;
13        }
14        for(int i=1; i<=n; i++) {
15            if(adj.get(i).size() == 0 && indegree[i] == n-1) return i;
16        }
17        return -1;
18    }
19}