// Last updated: 04/04/2026, 23:32:21
class Pair {
    int row, col, time;
    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int time = 0;
        int freshCnt = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 2) {
                    queue.add(new Pair(i, j, 0));
                } else if(grid[i][j] == 1) {
                    freshCnt++;
                }
            }
        }
        int rottedByUs = 0;
        int[] deltaRow = new int[]{-1, 0, +1, 0};
        int[] deltaCol = new int[]{0, -1, 0, +1};
        while(!queue.isEmpty()) {
            Pair curr = queue.poll();
            time = Math.max(time, curr.time);
            for(int i=0;i<4;i++) {
                int row = curr.row + deltaRow[i];
                int col = curr.col + deltaCol[i];
                if(row>=0 && col>=0 && row<m && col<n && grid[row][col] == 1) {
                    grid[row][col] = 2;
                    rottedByUs++;
                    queue.add(new Pair(row, col, curr.time+1));
                }
            }
        }
        return freshCnt == rottedByUs ? time : -1;
    }
}