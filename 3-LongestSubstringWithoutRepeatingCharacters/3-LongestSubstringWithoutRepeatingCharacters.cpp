// Last updated: 04/04/2026, 23:39:14
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> map;
        int ans = 0;
        int left = 0, right = 0;
        while(right < s.size()) {
            char ch = s[right];
            if(map.find(ch) != map.end() && map[ch] >= left) {
                left = map[ch]+1;
            }
            map[ch] = right;
            ans = max(ans, right-left+1);
            right++;
        }
        return ans;
    }
};