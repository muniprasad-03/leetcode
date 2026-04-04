// Last updated: 04/04/2026, 23:27:37
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long ans = 0;
        int halfLen = n%2==0 ? (n/2) : (n/2)+1;
        for(int i=n-1;i>=0;i--) {
            if(halfLen>0) {
                ans += nums[i];
                halfLen--;
            } else {
                ans -= nums[i];
            }
        }
        return ans;
    }
}