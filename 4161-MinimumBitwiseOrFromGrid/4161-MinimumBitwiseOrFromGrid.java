// Last updated: 04/04/2026, 23:26:53
class Solution {
    public int minimumOR(int[][] grid) {
        int ans = 0;
        for(int i=17; i>=0; i--) {
            int tar = ans | ((1<<i)-1);
            if(!isPossible(grid, tar)) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
    private boolean isPossible(int[][] grid, int tar) {
        for(int[] row : grid) {
            boolean rowOk = false;
            for(int num : row ) {
                if((num | tar) == tar) {
                    rowOk = true;
                    break;
                }
            }
            if(!rowOk) return false;
        }
        return true;
    }
}