// Last updated: 04/04/2026, 23:30:11
class Solution {
    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            if (seen[idx]) {
                return ch;
            }
            seen[idx] = true;
        }
        return '0';
    }
}
