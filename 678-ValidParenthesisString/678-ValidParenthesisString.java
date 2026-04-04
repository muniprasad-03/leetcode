// Last updated: 04/04/2026, 23:33:29
class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low = Math.max(0, low - 1);
                high--;
            } else if (ch == '*') {
                low = Math.max(0, low - 1); 
                high++;
            }
            if (high < 0) return false;
        }
        return low == 0;
    }
}
