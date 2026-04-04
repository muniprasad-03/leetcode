// Last updated: 04/04/2026, 23:29:04
class Solution {
    public int smallestNumber(int n) {
        int x = 1;
        while(((1<<x)-1)<n) x++;
        return (1<<x)-1;
    }
}