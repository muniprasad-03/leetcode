// Last updated: 04/04/2026, 23:28:09
class Solution {
    public int earliestTime(int[][] tasks) {
        int mFT = Integer.MAX_VALUE;
        for(int[] work : tasks) {
            int cFT = work[0]+work[1];
            mFT=Math.min(mFT,cFT);
        }
        return mFT;
    }
}