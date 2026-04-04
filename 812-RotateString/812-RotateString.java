// Last updated: 04/04/2026, 23:33:05
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }
}
