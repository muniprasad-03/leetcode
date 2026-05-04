// Last updated: 04/05/2026, 23:30:45
class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] closest = new int[n];
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                closest[i] = 1;
            } else if(i == n-1) {
                closest[i] = n-2;
            } else {
                int leftDiff = nums[i]-nums[i-1];
                int rightDiff = nums[i+1]-nums[i];

                if(leftDiff <= rightDiff) {
                    closest[i] = i-1;
                } else {
                    closest[i] = i+1;
                }
            }
        }
        long[] pref = new long[n];
        for(int i = 0; i < n-1; i++) {
            int cost;
            if(closest[i] == i+1) {
                cost = 1;
            } else {
                cost = nums[i+1]-nums[i];
            }
            pref[i+1] = pref[i]+cost;
        }
        long[] suff = new long[n];
        for(int i = n-1; i > 0; i--) {
            int cost;
            if(closest[i] == i-1) {
                cost = 1;
            } else {
                cost = nums[i]-nums[i-1];
            }
            suff[i-1] = suff[i]+cost;
        }
        int q = queries.length;
        int[] ans = new int[q];
        for(int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l < r) {
                ans[i] =(int)(pref[r]-pref[l]);
            } else {
                ans[i] =(int)(suff[r]-suff[l]);
            }
        }
        return ans;
    }
}