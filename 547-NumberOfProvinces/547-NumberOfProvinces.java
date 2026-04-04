// Last updated: 04/04/2026, 23:33:46
class Solution {
    private void dfs(int node, int[][] isConnected , boolean[] vis) {
        vis[node] = true;
        for(int child = 0; child < isConnected.length; child++) {
            if(isConnected[node][child] == 1 && !vis[child]) {
                dfs(child, isConnected, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n+1];
        int cnt = 0;
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                cnt++;
                dfs(i, isConnected, vis);
            }
        }
        return cnt;
    }
}