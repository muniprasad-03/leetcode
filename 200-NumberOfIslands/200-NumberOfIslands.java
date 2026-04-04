// Last updated: 04/04/2026, 23:36:03
class Solution {
    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0) return 0;
        int m=grid.length;
        int n=grid[0].length;
        int noOfIslands=0;
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if (grid[i][j]=='1') {
                    noOfIslands++;
                    Queue<int[]> queue=new LinkedList<>();
                    queue.offer(new int[]{i,j});
                    grid[i][j]='0';
                    while (!queue.isEmpty()) {
                        int[] cell=queue.poll();
                        for (int[] dir : directions) {
                            int r=cell[0]+dir[0];
                            int c=cell[1]+dir[1];
                            if (r>=0&&r<m&&c>=0&&c<n&&grid[r][c]=='1') {
                                grid[r][c]='0';
                                queue.offer(new int[]{r,c});
                            }
                        }
                    }
                }
            }
        }
        return noOfIslands;
    }
}