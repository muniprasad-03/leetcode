// Last updated: 04/04/2026, 23:26:42
class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
        }
        if(c>0) return (int)Math.floor(v/c);
        else return 0;
    }
}