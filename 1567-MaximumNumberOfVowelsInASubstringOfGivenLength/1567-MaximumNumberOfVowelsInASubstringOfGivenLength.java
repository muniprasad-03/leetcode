// Last updated: 04/04/2026, 23:31:26
class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        String vowString = "aeiou";
        int l = 0, i = 0;
        int vowelCount = 0;
        for(i=0;i<k;i++) {
            if(vowString.indexOf(s.charAt(i)) != -1) vowelCount++;
        }
        int maxVowels = vowelCount;
        for(int r = i; r < n; r++) {
            if(vowString.indexOf(s.charAt(r)) != -1) vowelCount++;
            if(vowString.indexOf(s.charAt(l)) != -1) vowelCount--;
            maxVowels = Math.max(maxVowels, vowelCount);
            l++;
        }
        return maxVowels;
    }
}