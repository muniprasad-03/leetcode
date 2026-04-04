// Last updated: 04/04/2026, 23:34:24
class Solution {
    private int findMaxFrequency(int[] map) {
        int maxFreq = map[0];
        for(int freq : map) {
            maxFreq = Math.max(maxFreq, freq);
        }
        return maxFreq;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxLen = 0;
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int[] map = new int[26];
        while(right < n) {
            map[s.charAt(right)-'A']++;
            maxFreq = findMaxFrequency(map);
            int len = right - left + 1;
            if(len - maxFreq <= k) {
                maxLen = Math.max(maxLen, len);
            } else {
                map[s.charAt(left++)-'A']--;
            }
            right++;
        }
        return maxLen;
    }
}