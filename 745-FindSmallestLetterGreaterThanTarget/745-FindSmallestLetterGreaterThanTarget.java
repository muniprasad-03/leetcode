// Last updated: 04/04/2026, 23:33:13
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        for(int i=0;i<n;i++) {
            if(letters[i]==target && i+1<n && letters[i+1]>target) return letters[i+1];
            else if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}