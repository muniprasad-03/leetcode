// Last updated: 04/04/2026, 23:32:12
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%5==0 ||k%2==0) return -1;
        boolean found = false;
        int rem = 0;
        int len = 0;
        while(true) {
            rem = ((rem*10)+1) % k;
            len++;
            if(rem==0) return len;
        }
    }
}