// Last updated: 04/04/2026, 23:34:00
class Solution {
    private int ans=0;
    private int target=0;
    public void help(int[] nums,int idx,int val) {
        if(idx==nums.length) {
            if(val==target) ans++;
            return;
        }
        help(nums,idx+1,val+(nums[idx]));
        help(nums,idx+1,val+(-nums[idx]));
    }
    public int findTargetSumWays(int[] nums, int target) {
        this.target=target;
        help(nums,0,0);
        return ans;
    }
}