// Last updated: 04/04/2026, 23:34:39
class Solution {
public:
    char findTheDifference(string s, string t) {
        char ans = 0;
        for(char ch:s) ans ^= ch;
        for(char ch:t) ans ^= ch;
        return ans;
    }
};