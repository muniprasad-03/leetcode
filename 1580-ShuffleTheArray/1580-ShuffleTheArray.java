// Last updated: 04/04/2026, 23:31:21
class Solution {
    public int[] shuffle(int[] nums, int n) {
       // int len = nums.length;
        int[] ans = new int[2*n];
        int idx=0;
        for(int i=0;i<n;i++) {
            ans[idx++]=nums[i];
            ans[idx++]=nums[i+n];
        }
        return ans;
    }
}