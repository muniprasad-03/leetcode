// Last updated: 04/04/2026, 23:33:00
class Solution {
public:
    bool rotateString(string s, string goal) {
        return s.length()==goal.length() && (s+s).find(goal)!=string::npos;
    }
};