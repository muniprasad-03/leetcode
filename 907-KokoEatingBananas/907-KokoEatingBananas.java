// Last updated: 04/04/2026, 23:32:46
class Solution {
    private boolean canComplete(int[] piles,int banasPerHr,int h) {
        long time = 0;
        for(int bananas : piles) {
            time += (bananas+banasPerHr-1L)/banasPerHr;
        }
        return time <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int bananas : piles) end = Math.max(end, bananas);
        while(start <= end) {
            int banasPerHr = start + (end-start)/2;
            if(canComplete(piles, banasPerHr, h)) {
                end = banasPerHr-1; // decrease speed 
            } else {
                start = banasPerHr + 1; // increase speed
            }
        }
        return start;
    }
}