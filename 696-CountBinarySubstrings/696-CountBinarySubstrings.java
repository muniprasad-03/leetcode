// Last updated: 04/04/2026, 23:33:24
class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int prevCnt = 0;
        int currCnt = 1;
        int ans = 0;
        for(int i=1;i<n;i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                currCnt++;
            } else {
                ans += Math.min(currCnt, prevCnt);
                prevCnt = currCnt;
                currCnt = 1;
            }
        }
        ans += Math.min(prevCnt, currCnt);
        return ans;
    }
}