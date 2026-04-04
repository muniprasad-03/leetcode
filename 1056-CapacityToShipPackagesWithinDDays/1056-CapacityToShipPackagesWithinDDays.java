// Last updated: 04/04/2026, 23:32:16
class Solution {
    private boolean isValid(int[] weights, int wt, int days) {
        int dayCnt = 1;
        int temp = 0;
        for(int x : weights) {
            if(temp+x <= wt) {
                temp += x;
            } else {
                dayCnt++;
                temp = x;
            }
        }
        return dayCnt <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int start = 0; 
        int end = 0; 
        for(int wt : weights) {
            start = Math.max(start, wt);
            end += wt;
        }
        while(start < end) {
            int mid = start + (end-start)/2;
            if(isValid(weights, mid, days)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}