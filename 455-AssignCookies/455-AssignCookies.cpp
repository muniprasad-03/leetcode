// Last updated: 04/04/2026, 23:34:15
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int gptr = 0;
        int sptr = 0;
        int ans = 0;
        while(gptr < g.size() && sptr < s.size()) {
            if(g[gptr]<=s[sptr]) {
                ans++;
                gptr++;
            }
            sptr++;
        }
        return ans;
    }
};