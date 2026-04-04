// Last updated: 04/04/2026, 23:30:06
class Solution {
    public int longestSubarray(int[] nums) {
        int maxAnd = Integer.MIN_VALUE;
        int maxLen = 0;
        int currLen = 0;
        for(int num : nums) {
            if(num > maxAnd) {
                maxAnd = num;
                maxLen = 1;
                currLen = 1;
            }
            else if(num == maxAnd) {
                currLen++;
                maxLen = Math.max(currLen,maxLen);
            } else {
                currLen = 0;
            }
        }
        return maxLen;
    }
}