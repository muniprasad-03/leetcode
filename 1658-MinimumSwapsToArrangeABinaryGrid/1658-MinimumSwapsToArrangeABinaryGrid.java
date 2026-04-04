// Last updated: 04/04/2026, 23:31:14
class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] endZeroes = new int[n];
        for(int i=0;i<n;i++) {
            int cnt = 0;
            for(int j=n-1;j>=0;j--) {
                if(grid[i][j] == 0) {
                    cnt++;
                } else {
                    break;
                }
            }
            endZeroes[i] = cnt;
        }
        int ans = 0;
        for(int i=0; i<n; i++) {;
            int need = n - i - 1;
            int found = -1;
            for(int j=i; j<n; j++) {
                if(endZeroes[j] >= need) {
                    found = j;
                    break;
                }
            }
            if(found == -1) return -1;
            else ans += (found-i);
            for(int k=found; k>i; k--) {
                endZeroes[k] = endZeroes[k-1];
            }
        }
        return ans;
    }
}