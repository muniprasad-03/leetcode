// Last updated: 04/04/2026, 23:26:19
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        while(str.length() != 0 && "aeiou".indexOf(str.charAt(str.length()-1)) != -1) {
            str.deleteCharAt(str.length()-1);
        }
        return str.toString();
    }
}