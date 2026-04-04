// Last updated: 04/04/2026, 23:30:04
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int l=0;
        long ans = Long.MIN_VALUE;
        long sum = 0;
        for(int i=0;i<n;i++) {
            while(set.contains(nums[i])) {
                set.remove(nums[l]);
                sum -= nums[l++];
            }
            set.add(nums[i]);
            sum += nums[i];
            if(i-l+1 > k) {
                set.remove(nums[l]);
                sum -= nums[l++];
            }
            if(i-l+1 == k) {
                ans = Math.max(ans, sum);
            }
        }
        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}