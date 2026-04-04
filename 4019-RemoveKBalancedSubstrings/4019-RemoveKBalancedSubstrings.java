// Last updated: 04/04/2026, 23:28:04
class Solution {
    public String removeSubstring(String s, int k) {
        String pattern="(".repeat(k)+")".repeat(k);
        int patternLen = 2*k;
        StringBuilder ansStack = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            ansStack.append(s.charAt(i));
            if(ansStack.length()>=patternLen) {
                if(ansStack.substring(ansStack.length()-patternLen,ansStack.length()).equals(pattern)) {
                    ansStack.delete(ansStack.length()-patternLen, ansStack.length());
                }
            }
        }
        return ansStack.toString();
    }
}