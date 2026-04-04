// Last updated: 04/04/2026, 23:26:21
class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;
        boolean active = true;
        int p1Score = 0;
        int p2Score = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] % 2 == 1) {
                active = !active;
            }
            if((i+1)%6 == 0) {
                active = !active;
            }
            if(active) p1Score += nums[i];
            else p2Score += nums[i];
        }
        return p1Score - p2Score;
    }
}