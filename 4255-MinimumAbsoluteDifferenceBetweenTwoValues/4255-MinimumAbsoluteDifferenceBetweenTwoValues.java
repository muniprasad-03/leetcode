// Last updated: 04/04/2026, 23:26:05
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        boolean found = false;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(nums[i] == 1 && nums[j] == 2) {
                    minDiff = Math.min(minDiff, Math.abs(i-j));
                    found = true;
                }
            }
        }
        return found ? minDiff : -1;
    }
}