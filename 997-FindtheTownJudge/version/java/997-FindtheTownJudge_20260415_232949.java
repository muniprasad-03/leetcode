// Last updated: 15/04/2026, 23:29:49
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int[] indegree = new int[n+1];
4        int[] outdegree = new int[n+1];
5        for(int[] t : trust) {
6            int a = t[0];
7            int b = t[1];
8            outdegree[a]++;
9            indegree[b]++;
10        }
11        for(int i=1; i<=n; i++) {
12            if(outdegree[i] == 0 && indegree[i] == n-1) return i;
13        }
14        return -1;
15    }
16}