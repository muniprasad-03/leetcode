// Last updated: 04/04/2026, 23:27:31
class Solution {
    public int maxDistinct(String s) {
        Set<Character> unChars = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            unChars.add(s.charAt(i));
        }
        return unChars.size();
    }
}