// Last updated: 04/04/2026, 23:28:53
class Solution {
    public boolean check(long[] arr, long tot) {
        long pref = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(tot == 2*pref) return true;
            pref += arr[i];
        }
        return false;
    }
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long[] rowSum = new long[m];
        long[] colSum = new long[n];
        long totalSum = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
                totalSum += grid[i][j];
            }
        }
        return check(rowSum, totalSum) || check(colSum, totalSum);
    }
}