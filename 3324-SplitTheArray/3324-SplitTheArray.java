// Last updated: 04/04/2026, 23:29:36
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
            if (freq[num]>2) return false; 
        }
        return true;
    }
}
