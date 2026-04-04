// Last updated: 04/04/2026, 23:31:09
class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        String repeat = word;
        int idx = sequence.indexOf(word);
        while(idx != -1) {
            ans++;
            repeat += word;
            idx = sequence.indexOf(repeat);
        }
        return ans;
    }
}