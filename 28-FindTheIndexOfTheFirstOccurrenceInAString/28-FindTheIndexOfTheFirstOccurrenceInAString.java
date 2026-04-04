// Last updated: 04/04/2026, 23:38:37
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(n < m) return -1;
        int i = 0;
        int j = 0;
        while(i < n){
            while(i < n && haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j == m) return i - j;
            }
            i = i - j + 1;
            j = 0;
        }
        return -1;
    }
}
