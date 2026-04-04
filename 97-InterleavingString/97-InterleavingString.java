// Last updated: 04/04/2026, 23:37:24
class Solution {
    private String s1, s2, s3;
    private int l1, l2, l3;
    private Boolean[][] cache;
    private boolean help(int k, int i, int j) {
        if(k == l3) {
            return cache[i][j] = true;
        } 
        if(cache[i][j] != null) return cache[i][j];
        Boolean ans;
        if(i<l1 && j<l2 && s3.charAt(k) == s1.charAt(i) && s3.charAt(k) == s2.charAt(j)) {
            ans = (help(k+1, i+1, j) || help(k+1, i, j+1));
        } else if(i<l1 && s3.charAt(k) == s1.charAt(i)) {
            ans = help(k+1, i+1, j);
        } else if(j<l2 && s3.charAt(k) == s2.charAt(j)) {
            ans = help(k+1, i, j+1);
        } else {
            ans = false;
        }
        return cache[i][j] = ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        this.s1 = s1; this.s2 = s2; this.s3 = s3;
        this.l1 = s1.length(); this.l2 = s2.length(); this.l3 =s3.length();
        if(l1+l2 != l3) return false;
        this.cache = new Boolean[l1+1][l2+1];
        return help(0, 0, 0);
    }
}