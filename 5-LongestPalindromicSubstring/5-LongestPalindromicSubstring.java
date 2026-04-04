// Last updated: 04/04/2026, 23:39:10
class Solution {
    private int check(int left, int right, String s) {
        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int ansStart = 0;
        int ansEnd = 0;
        for(int i=0;i<n;i++) {
            int lenIfOdd = check(i, i, s);
            int lenIfEven = check(i, i+1, s);
            int maxLen = Math.max(lenIfOdd, lenIfEven);
            if(maxLen > ansEnd - ansStart) {
                ansStart = i-(maxLen-1)/2;
                ansEnd = i+maxLen/2;
            }
        }
        return s.substring(ansStart, ansEnd+1);
    }
}