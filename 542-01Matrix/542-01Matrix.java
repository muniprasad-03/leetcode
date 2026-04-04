// Last updated: 04/04/2026, 23:33:49
class Pair {
    int u, v, steps;
    Pair(int u, int v, int steps) {
        this.u = u;
        this.v = v;
        this.steps = steps;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int[][] ans = new int[m][n];
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] == 0) {
                    queue.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                Pair curr = queue.poll();
                int row = curr.u;
                int col = curr.v;
                ans[row][col] = curr.steps;
                vis[row][col] = true;
                if(row-1>=0 && !vis[row-1][col]){
                    vis[row-1][col]=true;
                    queue.add(new Pair(row-1,col,curr.steps+1));
                }
                if(row+1<m && !vis[row+1][col]){
                    vis[row+1][col]=true;
                    queue.add(new Pair(row+1,col,curr.steps+1));
                }
                if(col-1>=0 && !vis[row][col-1]){
                    vis[row][col-1]=true;
                    queue.add(new Pair(row,col-1,curr.steps+1));
                }
                if(col+1<n && !vis[row][col+1]){
                    vis[row][col+1]=true;
                    queue.add(new Pair(row,col+1,curr.steps+1));
                }
            }
        }
        return ans;
    }
}