// Last updated: 04/04/2026, 23:26:04
class Solution {
    public boolean uniformArray(int[] nums1) {
        return check(nums1, 0) || check(nums1, 1);
    }
    public boolean check(int[] nums, int tar) {
        for(int i=0;i<nums.length;i++) {
            boolean isPossible = false;
            if(Math.abs(nums[i]) % 2 == tar) {
                isPossible = true;
            } else {
                for(int j=0;j<nums.length;j++) {
                    if(i == j) continue;
                    if(Math.abs((nums[i]-nums[j]) % 2) == tar) {
                        isPossible = true;
                        break;
                    }
                }
            }
            if(!isPossible) return false;
        }
        return true;
    }
}