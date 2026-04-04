// Last updated: 04/04/2026, 23:29:07
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<n;i++) {
            List<Integer> diagEle = new ArrayList<>();
            for(int j=0;j<n-i;j++) {
                diagEle.add(grid[i+j][j]);
            }
            Collections.sort(diagEle,Collections.reverseOrder());
            int idx = 0;
            for(int j=0;j<n-i;j++) {
                grid[i+j][j] = diagEle.get(idx++);
            }
        }
        for(int i=1;i<n;i++) {
            List<Integer> diagEle = new ArrayList<>();
            for(int j=0;j<n-i;j++) {
                diagEle.add(grid[j][i+j]);
            }
            Collections.sort(diagEle);
            int idx = 0;
            for(int j=0;j<n-i;j++) {
                grid[j][i+j] = diagEle.get(idx++);
            }
        }
        return grid;
    }
}