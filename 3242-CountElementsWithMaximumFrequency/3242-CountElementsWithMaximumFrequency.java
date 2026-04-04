// Last updated: 04/04/2026, 23:29:41
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] map = new int[101];
        for(int num : nums) {
            map[num]++;
        }
        int maxFreq = 0;
        int maxFreqCnt = 0;
        for(int num : map) {
            if(num == maxFreq) {
                maxFreqCnt++;
            } else if(num > maxFreq) {
                maxFreq = num;
                maxFreqCnt = 1;
            }
        }
        return maxFreq*maxFreqCnt;
    }
}