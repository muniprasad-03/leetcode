// Last updated: 04/04/2026, 23:31:30
class Solution {
    public int maxPower(String s) {
        int idx=0;
        int ans=0;
        int len=s.length();
        while(idx<len) {
            char ch=s.charAt(idx);
            int cnt=1;
            idx++;
            while(idx<len && ch==s.charAt(idx)) {
                idx++;
                cnt++;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}