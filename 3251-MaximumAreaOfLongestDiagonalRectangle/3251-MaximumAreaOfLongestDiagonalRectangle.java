// Last updated: 04/04/2026, 23:29:46
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        double maxDiagonal = 0L;
        for(int[] rectangle : dimensions) {
            int len = rectangle[0];
            int wid = rectangle[1];
            double currDiag = Math.sqrt(len*len + wid*wid);
            if(currDiag > maxDiagonal) {
                maxDiagonal = currDiag;
                ans = len * wid;
            } else if (currDiag==maxDiagonal) {
                ans = Math.max(ans,len*wid);
            }
        }
        return ans;
    }
}