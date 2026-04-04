// Last updated: 04/04/2026, 23:27:58
class Solution {
    public int longestSubsequence(int[] nums) {
        int totXor = 0;
        for(int num : nums) {
            totXor ^= num;
        }
        if(totXor!=0) {
            return nums.length;
        } else {
            for(int num : nums) {
                if(num!=0) return nums.length-1;
            }
            return 0;
        }
    }
}