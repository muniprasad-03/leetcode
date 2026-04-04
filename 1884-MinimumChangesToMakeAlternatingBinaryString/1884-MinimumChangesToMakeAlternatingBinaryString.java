// Last updated: 04/04/2026, 23:31:00
class Solution {
    public int minOperations(String s) {
        char startsWith0 = '0';
        int cost1 = 0;
        int cost2 = 0;
        for(char ch : s.toCharArray()) {
            if(ch != startsWith0) cost1++;
            else cost2++;
            startsWith0 = (startsWith0 == '0') ? '1' : '0';
        }
        return Math.min(cost1, cost2);
    }
}