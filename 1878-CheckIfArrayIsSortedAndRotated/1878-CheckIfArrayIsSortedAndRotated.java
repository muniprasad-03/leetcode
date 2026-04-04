// Last updated: 04/04/2026, 23:31:01
class Solution {
    public boolean check(int[] nums) {
        boolean ans = true;
        int l=nums.length;
        int i=0;
        for(;i<l-1;i++) {
            if(nums[i] > nums[i+1]) {
                break;
            }
        }
        if(i==(l-1)) return ans;
        int j=i+1;
        for(;j<l-1;j++) {
            if(nums[j] > nums[j+1]) {
                ans=false;
                break;
            }
        }
        if(nums[l-1] > nums[0]) ans=false;
        return ans;
    }
}