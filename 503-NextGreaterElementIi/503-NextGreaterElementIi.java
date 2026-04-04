// Last updated: 04/04/2026, 23:33:56
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int ans[] = new int[len];
        for(int i=0;i<len;i++) {
            ans[i] = -1;
            int j=(i+1)%len;
            while(j!=i) {
                if(nums[i]<nums[j]) {
                    ans[i]=nums[j];
                    break;
                }
                j=(j+1)%len;
            }
        }
        return ans;
    }
}