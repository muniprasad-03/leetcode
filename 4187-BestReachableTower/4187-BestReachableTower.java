// Last updated: 04/04/2026, 23:26:37
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int cx = center[0];
        int cy = center[1];
        int bestQty = -1;
        int bestX = -1;
        int bestY = -1;
        for(int[] point : towers) {
            int x = point[0];
            int y = point[1];
            int q = point[2];
            int dist = Math.abs(x-cx)+Math.abs(y-cy);
            if(dist <= radius) {
                if(q > bestQty || 
                (bestQty == q && (x<bestX || (x==bestX && y<bestY)))) {
                    bestQty = q;
                    bestX = x;
                    bestY = y;
                }
            }
        }
        if(bestQty == -1) return new int[]{-1,-1};
        return new int[]{bestX, bestY};
    }
}