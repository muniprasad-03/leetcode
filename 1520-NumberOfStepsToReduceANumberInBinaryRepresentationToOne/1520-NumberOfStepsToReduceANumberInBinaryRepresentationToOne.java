// Last updated: 04/04/2026, 23:31:32
class Solution {
    public int numSteps(String s) {
        int carry = 0;
        int count = 0;
        int idx = s.length() - 1;
        while(idx > 0) {
            int lastBit = (s.charAt(idx)-'0')+carry;
            if(lastBit == 1) {
                carry = 1;
                count += 2;
            } else {
                count += 1;
            }
            idx--;
        }
        return count+carry;
    }
}