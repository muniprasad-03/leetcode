// Last updated: 04/04/2026, 23:29:10
class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return (long)nums[0]*nums[0];
        long ans = getScore(nums, -1);
        for(int i=0;i<n;i++) {
            ans = Math.max(getScore(nums, i), ans);
        }
        return ans;
    }
    private static long getScore(int[] nums, int skip) {
        long resGcd = 0, resLcm = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == skip) continue;
            if (resGcd == 0) {
                resGcd = resLcm = nums[i];
            } else {
                resGcd = gcd(resGcd, nums[i]);
                resLcm = (resLcm / gcd(resLcm, nums[i])) * nums[i];
            }
        }
        return resLcm*resGcd;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long rem = a % b;
            a = b; b = rem;
        }
        return a;
    }
}