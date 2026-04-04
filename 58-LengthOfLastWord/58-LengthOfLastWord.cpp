// Last updated: 04/04/2026, 23:38:06
class Solution {
public:
    int lengthOfLastWord(string s) {
        int i=s.length()-1;
        int ans = 0;
        while(i>=0 && s[i--]==' ');
        while(i>=0 && s[i--]!=' ') ans++;
        return ans+1;
    }
};