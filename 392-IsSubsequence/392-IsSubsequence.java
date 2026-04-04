// Last updated: 04/04/2026, 23:34:37
class Solution {
    public boolean isSubsequence(String s, String t) {
        int cnt = 0;
        int i=0,j=0;
        int n=s.length(),m=t.length();
        if(n==0 && m==0) return true;
        for(;j<m;j++) {
            if(i<n && s.charAt(i)==t.charAt(j)) {
                cnt++;
                i++;
            }
            if(cnt==n) return true;
        }
        return false;
    }
}