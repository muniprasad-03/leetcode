// Last updated: 04/04/2026, 23:35:06
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charToString = new HashMap<>();
        HashMap<String, Character> stringToChar = new HashMap<>();
        String[] strArr = s.split(" ");
        if(strArr.length != pattern.length()) return false;
        for(int i = 0; i<strArr.length; i++) {
            char ch = pattern.charAt(i);
            String str = strArr[i];
            if(charToString.containsKey(ch) && charToString.get(ch).equals(str) == false) {
                return false;
            } else if(stringToChar.containsKey(str) && stringToChar.get(str) != ch) {
                return false;
            } else {
                charToString.putIfAbsent(ch, str);
                stringToChar.putIfAbsent(str, ch);
            }
        }
        return true;
    }
}