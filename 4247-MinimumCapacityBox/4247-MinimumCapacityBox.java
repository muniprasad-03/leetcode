// Last updated: 04/04/2026, 23:26:12
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minCap = Integer.MAX_VALUE;
        int minIdx=-1;
        for(int i=0;i<capacity.length;i++) {
            if(capacity[i] >= itemSize && capacity[i] < minCap) {
                minCap = capacity[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
}