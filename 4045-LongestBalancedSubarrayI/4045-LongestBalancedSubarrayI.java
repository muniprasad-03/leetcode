// Last updated: 04/04/2026, 23:27:53
class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        for(int left = 0;left < nums.length;left++) {
            HashSet<Integer> oddSet = new HashSet<>();
            HashSet<Integer> evenSet = new HashSet<>();
            for(int right = left ; right < nums.length;right++) {
                if((nums[right]&1) == 0) {
                    evenSet.add(nums[right]);
                } else {
                    oddSet.add(nums[right]);
                }
                if(oddSet.size()==evenSet.size()) {
                    ans = Math.max(ans,right-left+1);
                }
            }
        }
        return ans;
    }
}