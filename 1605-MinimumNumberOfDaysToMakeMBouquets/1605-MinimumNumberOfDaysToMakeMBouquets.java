// Last updated: 04/04/2026, 23:31:17
class Solution {
    public boolean feasible(int[] bloomDay, int day, int m, int k) {
        int flowers = 0, bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    if (bouquets >= m) return true;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (feasible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
