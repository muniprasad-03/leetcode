// Last updated: 04/04/2026, 23:27:30
class Solution {
    public int minLengthAfterRemovals(String s) {
        int countA = 0;
        int countB = 0;
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                countA++;
            } else {
                countB++;
            }
        }
        return Math.abs(countA - countB);
    }
}