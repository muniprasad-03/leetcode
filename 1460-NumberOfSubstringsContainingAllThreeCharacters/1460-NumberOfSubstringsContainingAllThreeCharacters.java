// Last updated: 04/04/2026, 23:31:37
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] map = new int[3];
        int ans = 0;
        int l = 0;
        for(int r = 0; r < n; r++) {
            map[s.charAt(r)-'a']++;
            while(map[0]>0 && map[1]>0 && map[2]>0) {
                ans += (n-r);
                map[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}