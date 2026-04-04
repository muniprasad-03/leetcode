// Last updated: 04/04/2026, 23:28:56
class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int endIdx=26-(s.charAt(i)-'a');
            ans+=((i+1)*endIdx);
        }
        return ans;
    }
}