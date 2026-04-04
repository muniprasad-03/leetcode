// Last updated: 04/04/2026, 23:34:51
class Solution {
    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder(s);
        int n=ans.length();
        int i=0;
        int j=n-1;
        while(i<j) {
            while(i<j && !isVowel(s.charAt(i))) {
                i++;
            }
            while(i<j && !isVowel(s.charAt(j))) {
                j--;
            }
            if(i<n && j>=0) {
                char c1=s.charAt(i);
                char c2=s.charAt(j);
                ans.setCharAt(i,c2);
                ans.setCharAt(j,c1);
                i++;
                j--;
            }
        }
        return ans.toString();
    }
}