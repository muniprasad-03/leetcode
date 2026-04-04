// Last updated: 04/04/2026, 23:30:55
class Solution {
    public boolean checkOnesSegment(String s) {
        int i = 0;
        for(; i<s.length();i++) {
            if(s.charAt(i) == '1') continue;
            else break;
        }
        for(; i<s.length();i++) {
            if(s.charAt(i) == '0') continue;
            else break;
        }
        return (i == s.length()) ? true : false;
    }
}