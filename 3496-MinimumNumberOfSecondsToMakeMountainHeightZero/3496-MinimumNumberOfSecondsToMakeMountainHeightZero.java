// Last updated: 04/04/2026, 23:29:15
class Solution {
    private boolean check(int mh , int[] wt, long mid) {
        long h = 0;
        for(int t : wt) {
            h += (long)(Math.sqrt((2*mid)/t + 0.25) - 0.5);
            if(h >= mh) return true;
        }
        return false;
    }
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long max = Long.MIN_VALUE;
        for(int num : workerTimes) max = Math.max(num, max);
        long left = 1;
        long right = max*(mountainHeight*((long)mountainHeight+1)/2);
        while(left < right) {
            long mid = left + (right - left)/2;
            if(check(mountainHeight, workerTimes, mid)) {
                right = mid ;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}