// Last updated: 04/04/2026, 23:30:38
class Solution {
    private boolean dfs(List<List<Integer>> adj, boolean[] vis, int node, int destination) {
        if(node == destination) return true;
        vis[node] = true;
        for(int neighbour : adj.get(node)) {
            if(!vis[neighbour]) {
                if(dfs(adj, vis, neighbour, destination)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] vis = new boolean[n];
        return dfs(adj, vis, source, destination);
    }
}