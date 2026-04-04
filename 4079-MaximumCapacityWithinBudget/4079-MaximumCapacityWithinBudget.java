// Last updated: 04/04/2026, 23:27:36
class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n = costs.length;
        int[][] map = new int[n][2];
        for(int i=0;i<n;i++) {
            map[i][0] = costs[i];
            map[i][1] = capacity[i];
        }
        Arrays.sort(map, (a, b)-> Integer.compare(a[0], b[0]));
        int[] preMax = new int[n];
        preMax[0] = map[0][1];
        for(int i=1;i<n;i++) {
            preMax[i] = Math.max(preMax[i-1], map[i][1]);
        }
        int ans = 0;
        for(int i=0;i<n;i++) {
            int cost = map[i][0];
            int cap = map[i][1];
            if(cost<budget) {
                ans = Math.max(ans, cap);
            }
            int target = budget-cost-1;
            int j=findMaxIdx(map, target, i-1);
            if(j != -1) {
                ans = Math.max(ans, cap+preMax[j]);
            }
        }
        return ans;
    }
    private int findMaxIdx(int[][] map, int target, int maxIdx) {
        int low = 0;
        int high = maxIdx;
        int res = -1;
        while(low <= high) {
            int mid = low+(high-low)/2;
            if(map[mid][0] <= target) {
                res = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return res;
    }
}