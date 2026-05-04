// Last updated: 04/05/2026, 23:30:47
class Solution {
    public boolean validDigit(int n, int x) {
        boolean contains = false;
        int lastDig = -1;
        while(n > 0) {
            int last = n % 10;
            if(last == x) {
                contains = true;
            }
            if(n <= 9 ) {
                lastDig = last;
            }
            n = n / 10;
        }
        return contains && (lastDig != x);
    }
}