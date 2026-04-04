// Last updated: 04/04/2026, 23:34:40
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hm = new int[26];
        for(char ch : magazine.toCharArray()) {
            hm[ch-'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            if(hm[ch-'a']==0) return false;
            hm[ch-'a']--;
        }
        return true;
    }
}