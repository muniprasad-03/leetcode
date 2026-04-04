// Last updated: 04/04/2026, 23:26:45
class Solution {
    public int minimumK(int[] nums) {
        int low = 1;
        int high = 100000;
        int ans = high;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(check(nums, mid)) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean check(int[] nums, int k) {
        long totalOps = 0;
        long lim = (long)k*k;
        for(int num : nums) {
            totalOps+=(num+k-1)/k;
            if(totalOps>lim) return false;
        }
        return true;
    }
}