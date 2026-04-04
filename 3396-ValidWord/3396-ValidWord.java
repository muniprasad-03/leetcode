// Last updated: 04/04/2026, 23:29:27
class Solution {
    public boolean isValid(String input) {
        if (input.length() < 3) {
            return false;
        }
        boolean vowelFound = false;
        boolean consonantFound = false;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (isVowel(ch)) {
                vowelFound = true;
            } else if (Character.isLetter(ch)) {
                consonantFound = true;
            }
        }
        return vowelFound && consonantFound;
    }

    private boolean isVowel(char ch) {
        return "ueoaiUEOAI".indexOf(ch) != -1;
    }
}
