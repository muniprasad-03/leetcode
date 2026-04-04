// Last updated: 04/04/2026, 23:29:19
class Solution {
    public boolean  isVowel(char ch) {
        return "aeiou".indexOf(ch)!=-1;
    }
    public boolean doesAliceWin(String s) {
        for(char ch:s.toCharArray()) {
            if(isVowel(ch)) return true;
        }
        return false;
    }
}