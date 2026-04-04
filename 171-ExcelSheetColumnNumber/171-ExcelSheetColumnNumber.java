// Last updated: 04/04/2026, 23:36:12
class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for(int i = 0; i<columnTitle.length(); i++) {
            int val = columnTitle.charAt(i)-'A'+1;
            ans = ans*26+val;
        }
        return ans;
    }
}