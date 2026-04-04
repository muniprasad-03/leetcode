// Last updated: 04/04/2026, 23:28:34
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxLen = 0;
        int i = 0;
        for(int j=0;j<n;j++) {
            while(k*(long)nums[i]<nums[j]) {
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
        }
        return n-maxLen;
    }
}